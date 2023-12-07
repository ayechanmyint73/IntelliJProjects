package chapter4oop_basics;

public class Lesson7ReturnType {
    static void sum(){
        int a = 5;
        int b = 19;
        int result = a + b;
        System.out.println("(without return type <with static> : ) sum => "+result);
    }

    int multiple(){
        int x = 4;
        int y = 2;
        int multResult = x * y;
        System.out.print("(with return type <with instance> : ) multiply => ");
        return multResult;
    }

    static String name(){
        System.out.print("(with return type <with static> : ) name => ");
        return "Aye";
    }

    public static void main(String[] args) {
        //without return type
        sum();

        // return type with instance method
        Lesson7ReturnType ret = new Lesson7ReturnType();
        System.out.println(ret.multiple());

        // return type with static method
        System.out.println(name());
    }
}
