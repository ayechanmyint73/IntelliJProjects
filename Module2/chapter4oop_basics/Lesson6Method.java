package chapter4oop_basics;

public class Lesson6Method {

    //syntax => returnType methodName(parameters){implement}

    //instance method
    void display(){
        System.out.println("Displaying instance method");
    }

    //static method
    static void show(){
        System.out.println("Showing static method");
    }

    public static void main(String[] args) {

        Lesson6Method organizeMethod = new Lesson6Method();
        organizeMethod.display();

        show();

        //calling static method from class name
        Lesson6Method.show();
    }
}
