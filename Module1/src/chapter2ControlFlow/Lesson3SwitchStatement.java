package chapter2ControlFlow;

public class Lesson3SwitchStatement {
    public static void main(String[] args) {
        String day = "sunday";

        // we need to use ** break ** if it is not used, the following expression will work.

        switch (day){
            case "Monday":
                System.out.println("monday");break;
            case "Tuesday":
                System.out.println("tuesday");break;
            case "Wednesday":
                System.out.println("wednesday");break;
            case "Thursday":
                System.out.println("thursday");break;
            case "Friday":
                System.out.println("friday");break;
            default:
                System.out.println("day off!");
        }
    }
}

/*
 switch(expression){} */
