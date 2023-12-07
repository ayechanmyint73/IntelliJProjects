package chapter4oop_basics;

public class Lesson5Student {
    int id;
    String name;
    String town;
    static String schoolName = "CodeWall";

    // the instance variables belong to specific type of object
    // the static variables belong to every object
    // if the static variable wants to change, it needs to call the class name

    public static void main(String[] args) {
        Lesson5Student student1 = new Lesson5Student();
        student1.id = 1;
        student1.name = "John";
        student1.town = "Bago";
        System.out.println("student 1 name => "+student1.name);

        Lesson5Student student2 = new Lesson5Student();
        student2.id = 2;
        student2.name = "Mary";
        student2.town = "Yangon";
        System.out.println("student 2 name => "+student2.name);


        System.out.println("original school of stu 1 => "+student1.schoolName);
        System.out.println("original school of stu 1 => "+student2.schoolName);


        Lesson5Student.schoolName = "Tech";
        System.out.println("changed school name for student 1 => "+student1.schoolName);
        System.out.println("changed school name for student 2 => "+student2.schoolName);
    }
}
