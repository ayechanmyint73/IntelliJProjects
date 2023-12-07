package chapter6polymorphism;

public class Lesson9FinalKeywordUsages {

    public static void main(String[] args) {

        /* in array, using final keyword restrict to use in another array.
        * it will show error as follows.*/

//        final int[] numbers = new int[3];
//        numbers[0] = 3;
//        int[] numbers2 = {2,3,4};
//
//        numbers = numbers2;
    }
}

//final keyword in class
final class Parent2{

}

// using final keyword in class doesn't allow to extends in another class
// it will show error as follows

//class Childd extends Parent2{
//
//}




class Parent3{
    final void calculate(){

    }
}

//using final keyword in method doesn't allow to override that method
// it will show error as follows



