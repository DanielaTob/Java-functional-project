package com.java.functional._10_chaining;

public class Chaining {

    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("This")
                .append("is")
                .append("the")
                .append("way");

        Chainer chainer = new Chainer();

        Chainer chainer2 = chainer.sayHi();
        Chainer chainer3 = chainer2.sayBye();
        chainer.sayHi().sayBye();
    }

    static class Chainer{
        public Chainer sayHi(){
            System.out.println("Hi");
            return this;
        }
        public Chainer sayBye(){
            System.out.println("Bye");
            return this;
        }
    }

}
