package com.java.functional._04_fuctional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {

    public static void main(String[] args) {


        Function<Integer, Integer> squareFuction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFuction.apply(5));
        System.out.println(squareFuction.apply(25));


        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        //Predicate
        Predicate<Integer> isEven = x -> x % 2 == 0;
        isEven.test(4); //true

        Predicate<student> isApproved = student -> student.getCalificacion() >= 6.0;
        student luke = new student(5.9);
        System.out.println(isApproved.test(luke));

    }

    static class student{
        private double calificacion;
        public student(double calificacion){
            this.calificacion = calificacion;
        }
        public double getCalificacion() {
            return calificacion;
        }

    }
}
