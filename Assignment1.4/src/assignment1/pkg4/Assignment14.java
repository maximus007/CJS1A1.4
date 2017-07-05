
package assignment1.pkg4;

import java.util.Scanner;


public class Assignment14 {

    
    public static void main(String[] args) {
        int a;
        long b;
        float c;
        double d;
        
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the value for byte");
       byte e=sc.nextByte();
       
       System.out.println("enter the value for short");
       short f=sc.nextShort();
       
       a=e+f;
       System.out.println("Sum of e and f "+a);
       
       b=f+a;
       System.out.println("Sum of f and a"+b);
      
       c=a+b;
       System.out.println("Sum of a and b"+c);
      
       d=b+c;
       System.out.println("Sum of b and c"+d);
      
       
       
       
    }
    
}
