package chapter6polymorphism;

public class Lesson2MethodOverloading {

    /* methodloading
    - under same class and same method name
    - same name with different parameter numbers
    - same parameter but different data type
    */

    static void show(){}

    static void show(int a){
        System.out.println(a);
    }

    static void show(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }

    static void show(int a, int b, int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {
        show();
        show(1);
        show(1,2);
        show(1,2,3);
    }
}
