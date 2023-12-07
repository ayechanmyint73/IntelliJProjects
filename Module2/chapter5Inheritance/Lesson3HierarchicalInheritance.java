package chapter5Inheritance;

public class Lesson3HierarchicalInheritance {
    public static void main(String[] args) {
        Child2 child2 = new Child2();
        System.out.println(child2.x);
        System.out.println(child2.y);

        Child3 child3 = new Child3();
        System.out.println(child3.x);
        System.out.println(child3.z);
    }
}

class Parents3{
    String x = "parents group";
}

class Child2 extends Parents3{
    String y = "older child";
}

class Child3 extends Parents3{
    String z = "younger child";
}
