package chapter3Arrays;

import java.util.Arrays;

public class Lesson4TwoDimenstionalArray {
    public static void main(String[] args) {
//        int numbers[] = {14,15,16};
//        System.out.println(numbers.length);


        int numbers1[][] = {
                {2,3,4,5},
                {6,7,8,0},
                {88,22,11,44}
        };

        System.out.println(numbers1.length);

        System.out.println(numbers1[1][2]);

        String[][] studentArray = new String[3][2];
        studentArray[0][0] = "student1A";
        studentArray[0][1] = "student2A";

        studentArray[1][0] = "student1B";
        studentArray[1][1] = "student2B";

        studentArray[2][0] = "student1C";
        studentArray[2][1] = "student2C";

        System.out.println(studentArray[0][1]);
        System.out.println(Arrays.toString(studentArray[2]));
        System.out.println("equal to row amount => "+studentArray.length);
        System.out.println("equal to column amout => "+studentArray[0].length);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");

        // nested for loop for two dimensional array
        System.out.println("nested for loop ");
        for (int i = 0; i < studentArray.length; i++) {
            for (int j = 0; j < studentArray[i].length; j++) {
                System.out.print(studentArray[i][j].toLowerCase()+ "\t");
            }
            System.out.println();
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("nested for each");
        //nested for each loop for two dimensional array
        for (int[] numbers : numbers1) {
            for (int number : numbers) {
                System.out.print(number+3+ ",\t");
            }
            System.out.println();
        }

    }
}
