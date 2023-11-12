package chapter1.operators;

public class Lesson6ShiftOperators {
    public static void main(String[] args) {
        //shift operator ( >> << )
        int a = 25;
        int result = a<<3; // left shift (a * 2^3) = 25 * 8 = 200;
        System.out.println(result);

        result = a>>2;  // right shift (a * 2/shift<2^2>) = 25 * 4 = 6;
        System.out.println(result);
    }
}
