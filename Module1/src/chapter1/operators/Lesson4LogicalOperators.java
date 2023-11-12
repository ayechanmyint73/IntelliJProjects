package chapter1.operators;

public class Lesson4LogicalOperators {
    public static void main(String[] args) {
        // logical operators ( && || )

        boolean userName = true;
        boolean passWord = true;

        boolean signIn;
        signIn = userName && passWord;
        System.out.println(signIn);

        signIn = userName || passWord;
        System.out.println(signIn);

        System.out.println(!signIn);


    }
}
