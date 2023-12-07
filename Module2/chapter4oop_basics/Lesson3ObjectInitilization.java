package chapter4oop_basics;

public class Lesson3ObjectInitilization {
    String firstName;
    int age;

    public static void main(String[] args) {
        //obj create
        //obj can be called object, instance, and reference
        Lesson3ObjectInitilization obj = new Lesson3ObjectInitilization();
        obj.firstName = "Aye";
        obj.age = 22;

        Alian alian12 = new Alian();
        alian12.name = "MJ";
        alian12.age = 399;
        System.out.println(alian12.name);
        System.out.println(alian12.age);

        Alian alian13 = new Alian();
        System.out.println(alian13.name);
        System.out.println(alian13.age);
    }
}
class Alian{
    String name = "Josh";
    int age = 300;
}
