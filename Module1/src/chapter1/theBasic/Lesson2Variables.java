package chapter1.theBasic;

public class Lesson2Variables {

    public static void main(String[] args) {

        // syntax = structure of the sentence / otherwise grammar of the statement or sentence
        // dataType    variableName    assignmentOperator    value      endOperator
        // Note : the value from the right side will be assigned to the variableName
        String name = "Alice";  //declare variable

        System.out.println(name);
        System.out.println(name);

        name = "Mary";         // can change the variable without changing the dataType
        System.out.println(name);
        System.out.println(name);


        int price = 88 ;      // variable initialization
        String example;        // variable declaration
        System.out.println(price*3);
    }
}