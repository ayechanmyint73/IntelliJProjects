package chapter6polymorphism;

import java.util.Scanner;

public class Lesson3MethodOverloadingExe {

        static void transfer(String ph,int amt){
            System.out.println("You have transferred "+amt+" MMK to "+ph);
        }

        static void transfer(String ph,int amt,String notes){
            System.out.println("You have transferred "+amt + " MMK to "+ph);
            System.out.println("Note : "+notes);
        }
        public static void main(String[] args) {
            Scanner firstScan = new Scanner(System.in);

            System.out.print("Enter phone number to transfer: ");
            String phoneNumber = firstScan.nextLine();

            System.out.print("Enter amount: ");
            int amount = firstScan.nextInt();

//        Scanner secondScan = new Scanner(System.in);
            firstScan = new Scanner(System.in);

            System.out.print("Enter your notes: ");
            String notes = firstScan.nextLine();


            if (notes.isEmpty()){
                transfer(phoneNumber,amount);
            }else {
                transfer(phoneNumber,amount,notes);
            }


        }
}
