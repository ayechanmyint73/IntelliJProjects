package chapter4oop_basics;

public class Lesson14ObjectInitByConstructors {

    public static void main(String[] args) {
        Students students = new Students(1,"James","Yangon");
        Students students1 = new Students(2,"kathy","Holar");

        System.out.println(students.name);
        System.out.println(students1.name);
    }
}
class Students{
    int id;
    String name;
    String address;

    public Students(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}

//method khine constructors work with object
