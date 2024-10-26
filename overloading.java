import java.util.Scanner;

public class overloading {
    public static void main(String[] args) {
        calculator cla = new calculator();
        System.out.println(cla.sum(2,7));
        System.out.println(cla.sum((float) 3.6,(float)7.8));
        System.out.println(cla.sum(2,4,5));
    }
}
class calculator{
    int sum(int a,int b){
       return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
}
