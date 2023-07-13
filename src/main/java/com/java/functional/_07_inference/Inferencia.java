package com.java.functional._07_inference;

import com.java.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {

    public static void main(String[] args) {
        Function<Integer, String> funcionConvertidora  =
                x -> "Al doble: " + (x * 2);

        List<String> alumnos = NombresUtils.getList("Juan", "Luke", "leia");

        alumnos.forEach((String name)  -> System.out.println(name));

        System.out.println("---------------------------");
        alumnos.forEach(name  -> System.out.println(name));

        System.out.println("---------------------------");
        alumnos.forEach(System.out::println);
    }
}
