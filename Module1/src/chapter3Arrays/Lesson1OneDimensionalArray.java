package chapter3Arrays;

import java.util.Arrays;

public class Lesson1OneDimensionalArray {
    public static void main(String[] args) {

        //dataType variableName = value
        String name = "chan";

        //dataType arrayName = {values}
        String []names = {"firstName", "secondName", "thirdName", "forthName"};
        int []numbers = {23,54,87,90,43,34,22,45};

        System.out.println("original name -> " +name);
        System.out.println("array name(incorrect) -> "+names);
        System.out.println("array name(correct) -> "+ Arrays.toString(names));

        System.out.println("specific name in array -> "+names[2]);
        System.out.println("specific number in array -> "+numbers[6]);

        System.out.println("calculate no of arrays -> "+numbers.length);
        System.out.println("calculate array last number -> "+numbers[numbers.length-4]);

        name = "chan chan";
        names[0] = "updatedName";
        System.out.println("updated array -> " +Arrays.toString(names));


        // dataType arrayName new dataType as

        int numbers1[] = new int[4];
        System.out.println(Arrays.toString(numbers1));

        String names1[] = new String[3];
        System.out.println(Arrays.toString(names1));

        names1[0] = "firstName";
        System.out.println(Arrays.toString(names1));

    }
}
