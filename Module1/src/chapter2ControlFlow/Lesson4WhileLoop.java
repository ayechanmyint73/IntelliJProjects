package chapter2ControlFlow;

public class Lesson4WhileLoop {
    public static void main(String[] args) {

        // while loop statement
        int x = 0;
        while (x <6){
            System.out.println("x values : " +x);
            x++;
        }
        // while loop statement works when the condition is true and it still needs to increase one.
        // while (condition) {implementation}



        // do while loop statement
        int a = 0;
        do{
            System.out.println(a);
            a++;
        } while (a<3);
        // do{implement} while (condition)

        // do while statement works whenever the condition is right or wrong
        // if it is wronged, it still works at least once
        // if it is right, it works as flow

    }
}
