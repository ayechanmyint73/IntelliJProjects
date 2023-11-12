package chapter3Arrays;

import java.util.Arrays;

public class Lesson2LoopingAndOneDimensionalArray {
    public static void main(String[] args) {
        String []names = {"firstName", "secondName", "thirdName", "forthName"};
        int []numbers = {23,54,87,90,43,34,22,45};

        // while looping for one dimensional array
        int x = 0;
        while (x< names.length){
            names[x] = names[x].toUpperCase();
            x++;
        }
        System.out.println(Arrays.toString(names));

        for (int i = 1; i< names.length-1; i++){
            names[i] =names[i].toLowerCase();
        }
        System.out.println(Arrays.toString(names));


        for (int a = names.length - 1; a>=1; a--){
            System.out.print(names[a] + ", ");
        }



    }
}
