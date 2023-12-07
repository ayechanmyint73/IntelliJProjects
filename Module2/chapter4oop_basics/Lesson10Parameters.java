package chapter4oop_basics;

public class Lesson10Parameters {
    static void sum(){
        int a = 4;
        int b = 5;
        int sum = a + b;
        System.out.println("sum <without parameters> => "+sum);
    }

    static void multiply(int num1, int num2){
        System.out.println("multiply <with parameters> => " +num1*num2);
    }

    public static void main(String[] args) {
        sum();
        multiply(12,3);
    }


}
