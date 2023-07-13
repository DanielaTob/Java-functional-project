package com.java.functional._04_fuctional;

import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {
    public static void main(String[] args) {
        UnaryOperator<String> quote = text -> "\"" + text + "\"";

        System.out.println(quote.apply("This is the way"));

        BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
        System.out.println(multiplication.apply(5, 4));

        BiFunction<String, Integer, String>leftPad =
                (text, number) -> String.format("%" + number + "s", text);
        System.out.println(leftPad.apply("Java", 10));
    }
}
