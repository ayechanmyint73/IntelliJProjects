package chapter4oop_basics;

public class Lesson11AccessModifiers {
    /* four types of access modifiers
    1. public - can be able to accessed from everywhere within the file.
    2. default - cannot be able to access from outside the package.
    3. protected - can only be accessed inside the package.
    4. private - cannot be accessed outside the class*/

    //public
    public int pub = 10;

    //default
    int def = 20;

    //protected
    protected int prot = 40;

    //private
    private int priv = 50;

    public static void main(String[] args) {
        Lesson11AccessModifiers obj = new Lesson11AccessModifiers();
        System.out.println(obj.pub);
        System.out.println(obj.def);
        System.out.println(obj.prot);
        System.out.println(obj.priv);

        Modifier modifier = new Modifier();
        System.out.println(modifier);

    }
}

class Modifier{
    public static void main(String[] args) {
        Lesson11AccessModifiers obj1 = new Lesson11AccessModifiers();
        System.out.println(obj1.pub);
        System.out.println(obj1.def);
        System.out.println(obj1.prot);
    }
}
