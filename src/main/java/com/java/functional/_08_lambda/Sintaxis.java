package com.java.functional._08_lambda;

import com.java.functional._06_reference_operator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {

    public static void main(String[] args) {

        List<String> cursos = NombresUtils.getList("Java", "Functional");

        //- Lambda = No está almacenada en ningun lugar, unicamente en este fragmento de código.
        cursos.forEach(curso -> System.out.println(curso));

        //- BiFunction
        //- BiFunction<Integer, Integer, Integer> s = (x, y) -> x * y;
        usarBiFuction((x, y) -> x * y);
        usarBiFuction((x, y) -> {
            System.out.println("X: " + x + " Y: " + y);
            return x - y;
        });

        //- Lambda que no recibe argumentos, ni parametros, ni datos
        usarZero(() -> 2);

        //- Lambda Predicate = Lambda de tipo Predicate sin tener que definir el tipo de dato que recibe o retorna.
        usarPredicado(text -> text.isEmpty());

        //- Function que no recibe ningun dato ni retorna ningun dato
        usarNada(() -> {
            System.out.println("Hola");
        });

        //- Tipo de dato explicito
        usarBiFuction((Integer x, Integer y) -> x * y);

    }

    static void usarNada(OperarNada operarNada){

    }

    static void usarZero(ZeroArguments zeroArguments){

    }

    static void usarPredicado(Predicate<String> predicate){

    }

    static void usarBiFuction(BiFunction<Integer, Integer, Integer> operacion){

    }

    @FunctionalInterface
    interface ZeroArguments{
        int get();
    }

    @FunctionalInterface
    interface OperarNada{
        void nada();
    }
}
