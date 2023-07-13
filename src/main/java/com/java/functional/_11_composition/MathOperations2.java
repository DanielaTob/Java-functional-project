package com.java.functional._11_composition;

import java.util.function.Function;

public class MathOperations2 {

    //Funcion compuesta basada en dos funciones.

    public static void main(String[] args) {
        Function<Integer, Integer> function1 = x -> {
            System.out.println("Multiplicando x: " + x + " por 3");
            return x * 3;
        };

        Function<Integer, Integer> function2 =
                function1.compose(y -> {
                    System.out.println("Le agregaré 1 a: " + y);
                    return y + 1;
                });
        Function<Integer, Integer> function3 =
                function2.andThen(x -> {
                    System.out.println("Estoy elevando " + x + " al cuadrado");
                    return x * x;
                });

        System.out.println(function2.apply(5));
        System.out.println(function3.apply(3));
    }
}
