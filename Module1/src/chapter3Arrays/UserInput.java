package chapter3Arrays;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        //Type  ObjName = new Constructor;
        // Type => className
        // constructor => className();
        Scanner scan = new Scanner(System.in);  //create object

        System.out.println("Try something : ");
        String sample = scan.next();
        System.out.println("Name : "+sample);

        System.out.println("first no : ");
        int firstNo = scan.nextInt();

        System.out.println("second no : ");
        int secNo = scan.nextInt();

        int sum = firstNo + secNo;
        System.out.println("sum : " +sum);
    }
}