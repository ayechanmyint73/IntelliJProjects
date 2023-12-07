package chapter4oop_basics;

public class Lesson4Fruits {
    String name;
    String color;
    String size;

    //the message is that whatever the other class change its object (fruit1.name), it doesn't effect the other object (fruit2.name)

    public static void main(String[] args) {
        Lesson4Fruits fruit1 = new Lesson4Fruits();
        fruit1.name = "apple";
        fruit1.color = "red";
        fruit1.size = "big";
        System.out.println(fruit1);

        Lesson4Fruits fruit2 = new Lesson4Fruits();
        fruit2.name = "orange";
        fruit2.color = "orange";
        fruit2.size  = "small";
        System.out.println(fruit2);

        fruit1.name = "Graph";
        System.out.println(fruit2.name);
    }
}
