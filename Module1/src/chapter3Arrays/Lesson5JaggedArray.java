package chapter3Arrays;

public class Lesson5JaggedArray {
    public static void main(String[] args) {

        int numbersJagged[][] = {
                {2,3,4,5},
                {6,7},
                {88,22,11}
        };

        for (int i = 0; i < numbersJagged.length ; i++) {
            for (int j = 0; j < numbersJagged[i].length; j++) {
                System.out.print(numbersJagged[i][j]+ ", \t");
            }
            System.out.println();
        }

//        int[][] numberJagged1 = new int[3][];
//
//        numberJagged1[0][0] = 10;
//        numberJagged1[0][1] = 20;
//        numberJagged1[0][2] = 30;
//        numberJagged1[0][3] = 40;
//
//        numberJagged1[1][0] = 80;
//        numberJagged1[1][1] = 90;
//
//        numberJagged1[2][0] = 100;
//        numberJagged1[2][1] = 110;
//        numberJagged1[2][2] = 120;

        for (int[] numbers : numbersJagged) {
            for (int number : numbers) {
                System.out.println(number);
            }
        }
        System.out.println();

    }
}
