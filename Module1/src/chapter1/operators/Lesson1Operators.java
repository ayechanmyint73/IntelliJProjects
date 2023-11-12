package chapter1.operators;

public class Lesson1Operators {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("Unary operators ++value / value++");
        System.out.println("------------------------------------");
        System.out.println("original value => " +a);

        System.out.println("The pre-fix value firstly increase one then print out the result! \n" +
                "a + 1 (10+1) = 11 and then print out the result");
        System.out.println("before pre-fix value => " + ++a);
        System.out.println("after pre-fix value => " +a);
        System.out.println("___________________________________________________");

        System.out.println("The post-fix value firstly print out the result then increase one! \n" +
                "Print out the original value (10) then a + 1 (10+1) = 11 \n" +
                "Only when the variableName is recalled again, the value will be increased one");
        System.out.println("before post-fix value =>" + a++);
        System.out.println("after post-fix value => " +a);

    }
}
/*
1. unary (++ --)
pre-fix (++a) first it added one then it print out the result
post-fix (a++) first it print out the result then it added one

2. binary
arithmetic operators ( + - * / % )
comparison operators / relational operators ( > < <= >= == != )
logical operators ( && || )
bitwise operators ( & | ^ )
shift operators ( << >> >>> )
assignment operators ( = += -= *= /= %= )

3. ternary
   ()? :
 ()         ?              :
 (condition)? true(adults) : false(kids)
*/
