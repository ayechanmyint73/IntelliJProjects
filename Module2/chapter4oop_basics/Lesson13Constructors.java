package chapter4oop_basics;

public class Lesson13Constructors {
    //the system always build at least one constructor in every program

    /* two types of constructors
    1. default constructor / zero argument
    2. perameterized constructor*/
    Lesson13Constructors(){
        System.out.println("the pre-built constructor");
    }

    public static void main(String[] args) {
        Lesson13Constructors obj = new Lesson13Constructors();

        Clothes clothes1 = new Clothes();
        Clothes clothes2 = new Clothes("Shirt");

        clothes2.something();
    }
}

class Clothes{
    //default constructor
    Clothes(){
        System.out.println("clothes without parameters");
    }

    //perimeterized constructor
    Clothes(String name){
        System.out.println("clothes with parameter <name> => " + name);
    }

    void something(){
        System.out.println("buy something..");
    }
}
