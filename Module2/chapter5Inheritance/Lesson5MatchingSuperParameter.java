package chapter5Inheritance;

public class Lesson5MatchingSuperParameter {
    public static void main(String[] args) {

        /* when using the inheritance with the parameter,
         we need to use super keyword along with the parameters*/

        Child5 child5 = new Child5(4);
    }
}

class Parents5{
//    public Parents5() {
//        System.out.println("Parent group");
//    }

    public Parents5(int num){
        System.out.println("parent with parameter "+num);
    }
}

class Child5 extends Parents5{
    public Child5(int num) {
        super(num);
    }
}
