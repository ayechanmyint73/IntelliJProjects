package chapter4oop_basics;

public class Lesson16InitializerBlock {

    /* two types of initializer block
    1. instance initializer block - this block runs first before the main method
    2. static initializer block - this works when the constructor is created or called. refer to line 10 */

    public static void main(String[] args) {
        Lesson16InitializerBlock obj = new Lesson16InitializerBlock();
        System.out.println("I am main method");
    }

    static {
        System.out.println("I am static initializer block");
    }

    {
        System.out.println("I am instance initializer block.");
    }
}