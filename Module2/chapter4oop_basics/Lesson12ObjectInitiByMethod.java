package chapter4oop_basics;

public class Lesson12ObjectInitiByMethod {
    //object initialization using method

    /* there are three types of object initialization
     1. system reference (refer to : lesson3:ObjectInitialization)
     2. using method (refer to : lesson12<this lesson>)
     3. using constructors (refer to : ) */


    public static void main(String[] args) {
        Car car = new Car();
        car.insert(20,"malo");
        System.out.println("the length of the car_name => "+car.name.length());
        System.out.println(car.name);
    }
}

class Car{
    int id;
    String name;

    void insert(int car_id, String car_name){
        id = car_id;
        name = car_name;
    }
}
