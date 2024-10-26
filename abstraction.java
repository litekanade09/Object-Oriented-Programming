import java.util.Scanner;

public class abstraction {
    public static void main(String[] args) {
        code kanade = new code();
        kanade.walk();
        kanade.eat();
        System.out.print(kanade.color);
        height praj = new height();
        praj.eat();
        praj.walk();
        System.out.print(praj.color);

    }
}
abstract class prajwal{
    String color;
    prajwal(){
        color = "brown";
    }
    void eat(){
        System.out.println("EAT");
    }
    abstract void walk();
}
class code extends prajwal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("WALK");
    }
}
class height extends prajwal{
    void changeColor(){
        color = "white";
    }
    void walk(){
        System.out.println("WALK HEIGHT" );
    }
}