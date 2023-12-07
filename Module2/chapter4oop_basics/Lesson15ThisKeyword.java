package chapter4oop_basics;

public class Lesson15ThisKeyword {
    public static void main(String[] args) {
        className name = new className(1, "John", "yangon");
        name.show();

        className name1 = new className(2,"jey", "mand");
        name1.show();
    }

    // this keyword represents the determined object.

}

class className{
    int id;
    String name;
    String town;

    public className(int id, String name, String town) {
        this.id = id;
        this.name = name;
        this.town = town;
    }

    void show(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(town);
    }
}
