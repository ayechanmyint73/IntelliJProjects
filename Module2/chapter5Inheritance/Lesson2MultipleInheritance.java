package chapter5Inheritance;

public class Lesson2MultipleInheritance {

    /* */

    public static void main(String[] args) {
        Parents1 parents1 = new Parents1();
        System.out.println(parents1.x);
        System.out.println(parents1.y);

        Child1 child1 = new Child1();
        System.out.println(child1.x);
        System.out.println(child1.y);
        System.out.println(child1.z);
    }
}
class GrandParents{
    String x = "grandparents group (first owner)";
}

class Parents1 extends GrandParents{
    String y = "parents group (second owner)";
}

class Child1 extends Parents1{
    String z = "child group (last owner)";
}
