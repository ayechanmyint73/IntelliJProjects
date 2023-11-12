package chapter1.operators;

public class TernaryOperators {
    public static void main(String[] args) {
        // (condition)? correctResult : incorrectResult

        boolean condition = 17>13;
        String isTrue = "The statement true";
        String isFalse = "The statement false";
        String greater = (condition)? isTrue : isFalse;
        System.out.println(greater);

        int age = 13;
        String isAdult = (age >=18)? "is adult" : "not adult";
        System.out.println(isAdult);

    }
}
