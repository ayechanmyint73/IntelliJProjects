package chapter4oop_basics;

class Company{
    static String firstName = "chan";

    String lastName = "aye";
}
public class Lesson1Variables {

    //global variables/properties/identifiers/state/attributes/fields/data members
    int number1 = 10; //instance variable

    static int number2 = 22; //static variable


    public static void main(String[] args) {
        int x = 100; //local varialbe
        System.out.println("Local variable : " +x);

        // Type     ObjectName       = object(new constructors);
        Lesson1Variables lesson1Variables = new Lesson1Variables();
        System.out.println("instance variable value : "+lesson1Variables.number1);

        System.out.println(Lesson1Variables.number2);
        System.out.println(number2);

        Company company = new Company();
        System.out.println(company.lastName);

        System.out.println(Company.firstName);
    }
}