package chapter6polymorphism;

public class Lesson6MethodOverriding {
    public static void main(String[] args) {
        Child child = new Child();
        child.doSomething(2);
    }
}

class Parent{
    void doSomething(int a){
        System.out.println("old hobie" +a);
    }
}

// different implementation and different class

/* super without () refers to the parent constructor
 super with () refers to the parent class */

class Child extends Parent{
    @Override
    void doSomething(int a) {
        super.doSomething(a);
        System.out.println("new hobie" +a);
    }
}
