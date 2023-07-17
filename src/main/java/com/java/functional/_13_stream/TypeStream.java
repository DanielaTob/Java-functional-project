package com.java.functional._13_stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TypeStream {

    public static void main(String[] args) {
        //stream infinito
        IntStream infiniteStream = IntStream.iterate(0, x -> x + 1);
        List<Integer> numberList = infiniteStream.limit(1000)
                .filter(x -> x % 2 == 0)
                .boxed() //cambiamos a otro tipo de string
                .collect(Collectors.toList()); //convierte un stream de datos en una estructura ya fisica, que no tiene operadores, si no datos concretos.
    }
}
