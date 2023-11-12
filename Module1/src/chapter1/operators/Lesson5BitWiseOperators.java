package chapter1.operators;

public class Lesson5BitWiseOperators {
    public static void main(String[] args) {
        // bitwise operator ( & | ^ )
        int a = 6, b = 3;
        int result;

        // related with binary 1 0 0 1, ** need to revise **
        result = a & b;
        System.out.println(result);

        result = a | b;
        System.out.println(result);

        result = a ^ b;
        System.out.println(result);
    }
}
