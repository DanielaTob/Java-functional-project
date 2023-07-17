package com.java.functional._13_stream;

import com.java.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {

    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList(
                "Java",
                "Frontend",
                "Backend",
                "Fullstack");
        for (String course : courseList){
            String newCourseName = course.toLowerCase().replace("!", "!!");
            System.out.println("Udemy: "  + newCourseName);
        }

        Stream<String> coursesStream = Stream.of(
                "Java",
                "Frontend",
                "Backend",
                "Fullstack");
        //Stream<Integer> courseLenghtStream = coursesStream.map(course -> course.length());

        //Optional<Integer> longest = courseLenghtStream.max((x, y) -> y - x);

        //1 - forma
        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("Java"));
        justJavaCourses.forEach(System.out::println);

        //2 - forma
        Stream<String> coursesStream2 = courseList.stream();

        addOperator(
                        coursesStream2.map(course -> course + "!!")
                        .filter(course -> course.contains("Java"))
        ).forEach(System.out::println);

        //Ejemplo
        List<String> starWars = NombresUtils.getList("Luke", "Leia", "Han Solo");
        starWars.forEach(System.out::println);
    }

    static <T> Stream<T> addOperator(Stream<T> stream){
        //Peek es similar a Map pero recibe un dato y devuelve el mismo dato. Genera una iteracion entre los datos.
        return stream.peek(data -> System.out.println("Dato: " + data));
    }
}
