import java.util.Scanner;

public class overridding {
    public static void main(String[] args) {
        Animalss d = new Animalss();
        d.eat();
    }
}
class Animalss{
    void eat(){
        System.out.print("EAT ANYTHING");
    }
}
class Deer extends Animalss{
    void eat(){
        System.out.print("EAT ");
    }
}