package chapter6polymorphism;

public class Lesson4MethodOverloadingRule2 {

    static void calculate(int a) {
        System.out.println("this is integer");
    }

    static void calculate(double b) {
        System.out.println("this is double");
    }

    /* create two methods called sum that take two parameters.
    first method takes two integer values and return the addition results.
    second method takes two decimal values and return the addition results.
    apply them in main method and output the result.*/


    public static void main(String[] args) {
        System.out.println(sum(3, 4));
        System.out.println(sum(4.3, 3.2));
    }

    static int sum(int a, int b){
        return a + b;
    }

    static double sum(double c, double d){
        return c + d;
    }
}
