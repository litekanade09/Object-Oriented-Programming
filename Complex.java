import java.util.Scanner;

public class Complex {
    int real;
    int imag;

    public Complex(int r,int i){
        this.real = r;
        this.imag = i;
    }
    public  void printComplex(){
        if(real == 0 && imag != 0){
            System.out.println("i"+imag);
        }else if(imag == 0 && real !=0 ){
            System.out.println(real);
        }else{
            System.out.println(real + "+i" + imag);
        }
    }
    public static Complex add(Complex a,Complex b){
        return new Complex((a.real + b.real),(a.imag + b.imag));
    }
     public static Complex sub(Complex a,Complex b){
         return new Complex((a.real - b.real),(a.imag - b.imag));
     }
     public static Complex mul(Complex a,Complex b){
         return new Complex(((a.real*b.real) - (a.imag*b.imag)),((a.real*b.imag) + (a.imag*b.real)));
     }
}
class Solution{
    public static void main(String[] args) {
        Complex c = new Complex(4,5);
        Complex d = new Complex(9,7);

        Complex e =  Complex.add(c,d);
        Complex f =  Complex.sub(c,d);
        Complex g =  Complex.mul(c,d);
        e.printComplex();
        f.printComplex();
        g.printComplex();
    }
}
