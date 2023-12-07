package chapter6polymorphism;

public class Lesson7TypeCasting {
    public static void main(String[] args) {
        int a = 3;
        long b = a; // widening casting

        byte bb = (byte) a;
        int c = (int) b; // narrowing casting

        Parents1 obj;
        obj = new Parents1();
    }
}

class Parents1{

}

class Child1 extends Parents1{

}

class Child2 extends Parents1{

}
