import java.util.Scanner;

public class hybridinheritance {
    public static void main(String[] args) {
        Shark tuna = new Shark();
        tuna.swim();
        peacock myna = new peacock();
        myna.dance();
        dogs kutta = new dogs();
        kutta.run();
    }
}
class Animals{
    void eat(){
        System.out.print("eats");
    }
    void breathe(){
        System.out.print("breathe");
    }
}
class fishs extends Animals{
    void fines(){
        System.out.print("fines");
    }
}
class Shark extends fishs{
    void swim(){
        System.out.print("SWIM");
    }
}
class birds extends Animals{
    void fly(){
        System.out.print("fly");
    }
}
class peacock extends birds{
    void dance(){
        System.out.print("DANCE");
    }
}
class Mammalss extends Animals{
    void legs(){
        System.out.print("legs");
    }
}
class dogs extends Mammalss{
    void run(){
        System.out.print("RUN");
    }
}
