package chapter5Inheritance;

public class Lesson7Aggregation {

    /* Animal (size, color, age)
    <is-a relation>  => inheritance


     dog, cat which are part of animals and they all have each characteristics
     in that case we use inheritance

     Address (home, street, city)
     <has-a relation>  => aggregation
     student (id, name, age, (home, street, city))


     when it comes to strudents, they all have same features about id, name, and age
     which allows to each,
     when it comes to address, they all have different properties
     but they also have same properities
     in this case, we use aggregation
     */

    public static void main(String[] args) {

        Student1 roll1 = new Student1(1, "Kyaw", 20, new Address1("tgo","st",22));

        roll1.show();
    }
}

class Address1 {
    String city;
    String street;
    int number;

    public Address1(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }
}

class Student1 {
    String name;
    int age;
    int id;
    Address1 address1;

    public Student1(int id, String name, int age, Address1 address1){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address1 = address1;
    }

    void show(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.age);
        System.out.println(this.address1.city);
        System.out.println(this.address1.street);
        System.out.println(this.address1.number);
    }
}
