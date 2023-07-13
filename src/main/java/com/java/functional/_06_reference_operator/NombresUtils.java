package com.java.functional._06_reference_operator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {

        List<String> profesores = getList("Nicolas", "Juan", "Luke");

        //Opción 1
        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);

        System.out.println("--------------------------------------");

        //Opción 2
        profesores.forEach(System.out::println);
    }

    public static<T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
