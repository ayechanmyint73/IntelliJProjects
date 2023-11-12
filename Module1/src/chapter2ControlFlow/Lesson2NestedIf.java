package chapter2ControlFlow;

public class Lesson2NestedIf {
    public static void main(String[] args) {
        int a = 30, b = 35, c = 50;

        if (a > b){
            if (a > c){
                System.out.println("a is the largest");
            } else {
                System.out.println("c is the largest");
            }
        }else {
            if (b > c){
                System.out.println("b is the largest");
            } else {
                System.out.println("c is the largest");
            }
        }

        // homework
        int firstValue = 60, secondValue = 33, thirdValue = 11;

        if (firstValue < secondValue){
            if(firstValue < thirdValue){
                System.out.println("First value is the smallest");
            } else {
                System.out.println("Third value is the smallest");
            }
        }else {
            if (secondValue < thirdValue){
                System.out.println("Second value is the smallest");
            }else {
                System.out.println("Third value is the smallest");
            }
        }
    }


}
