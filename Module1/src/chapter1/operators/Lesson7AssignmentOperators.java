package chapter1.operators;

public class Lesson7AssignmentOperators {
    public static void main(String[] args) {
        // +=, -=, *=, /=, %=

        int a = 10;
        int b = 4;

        a += b;
        System.out.println("first assignment value : " +a);

        b -= 5;
        System.out.println("second assignment value : "+b);

        a *= 3;
        System.out.println("third assignment value : "+a);

        b /= 3;
        System.out.println("forth assignment value : "+b);

        a %= 5;
        System.out.println("fifth assignment value : "+a);
    }
}
