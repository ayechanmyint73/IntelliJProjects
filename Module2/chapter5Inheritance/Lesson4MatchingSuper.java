package chapter5Inheritance;

public class Lesson4MatchingSuper {

    /* this super class works when the other inheritance extends the parent class
    there will be no changes whether it is used or not
    normally, it works behind the scense. */

    public static void main(String[] args) {
        Child4 child4 = new Child4();
    }
}

class Parents4{
    public Parents4() {
        System.out.println("This is parent constructor.");
    }
}

class Child4 extends Parents4{
    public Child4 () {
        super();
        System.out.println("This is child constructor. ");
    }
}
