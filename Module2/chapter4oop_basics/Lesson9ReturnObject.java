package chapter4oop_basics;

public class Lesson9ReturnObject {
    static  int number(){
        int a = 5;
        return 5;
    }
    static String[] message(){
        String[] names = {"aung","maung"};
        return  names;
    }
    static Person person(){
        Person obj = new Person();
        return  new Person();
    }
    public static void main(String[] args) {
        //dataType
        int a = 5;

        //Type
        Lesson9ReturnObject obj = new Lesson9ReturnObject();
    }
}
class Person{};
