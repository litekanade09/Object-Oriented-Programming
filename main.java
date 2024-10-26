import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        BankAccount myAcc =new BankAccount();
        myAcc.Username="Prajwal";
        myAcc.setPassword("hweouheughwg");
        System.out.print(myAcc.Username);

        Student s1 = new Student();
        Student s2 = new Student("Prajwal");
//
//        Fish Shark = new Fish();
//        Shark.eat();
//
//        Shark.swim();
//        dogs dobby = new dogs();
//        dobby.eat();
//        dobby.legs = 4;
//        System.out.print(dobby.legs);

        Mammals human = new Mammals();
        human.walk();

        fish shark = new fish();
        shark.fines();

    }
}
class BankAccount{
    public String Username;
    private String password;
    public void setPassword (String pwd){
        password = pwd;
    }
}
class Student{
    String name;
    //Non-parameterized
    Student(){
        System.out.print("Constusctor is called...");
    }
    //parameterized
    Student(String name){
        this.name = name;
    }
}
//Single or Multilevel Inheritance


//Base class
//class Animal{
//    String colors;
//    void eat(){
//        System.out.print("eat");
//    }
//    void breathe(){
//        System.out.print("Breathe");
//    }
//}
//Derived class
//class Fish extends Animal{
//    int fines = 2;
//    void swim(){
//        System.out.print("Swim");
//    }
//}
//derived class
//class Mammals extends Animal{
//    int legs;
//}
//class dogs extends Animal{
//    String breed;
//}


//Hierarchical Inheritance
class Animal{
    String colors;
    void eat(){
        System.out.print("eat");
    }
    void breathe(){
        System.out.print("Breathe");
    }
}
class Mammals extends Animal{
    void walk(){
        System.out.print("Walks");
    }
}
class fish extends Animal{
    void fines(){
        System.out.print("fines");
    }
}