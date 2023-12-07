package chapter4oop_basics;

import java.util.Scanner;

public class Lesson8ReturnIf {
    static String validate(){
        System.out.print("Please enter your age : ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput> 18){
            return "can";
        }
        return "can't";
    }

    public static void main(String[] args) {
        String valid = validate();
        System.out.println("You " +valid + " vote..");
    }
}
