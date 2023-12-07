package chapter5Inheritance;

public class Lesson1SingleInheritance {

    /* single inheritance means*/

    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child.x);
        System.out.println(child.y);

    }
}
class Parent{
    String x = "Parent group";
}

class Child extends Parent{
    String y = "Child group";
}
