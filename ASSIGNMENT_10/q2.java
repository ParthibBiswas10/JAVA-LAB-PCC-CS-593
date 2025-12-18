/*10.2 Write a java program to create two threads by implementing Runnable interface and assign the
following tasks:
Thread1 will calculate factorial of n integer numbers and display them.
Thread2 will calculate GCD of n integer numbers and display them.
Apply sleep(1000) to display the result in 1 second interval. */

import java.util.*;
class factorial implements Runnable{
    int n;
    factorial(int n){
        this.n=n;
    }
    
    public void run(){
    try{
     for (int i = 1; i <= n; i++) {
                long fact = 1;
                for (int j = 1; j <= i; j++) {
                    fact *= j;
                }
                System.out.println("Factorial of " + i + " = " + fact);
                Thread.sleep(1000);
     }
    }
     catch(Exception e){
         System.out.println(e);
    }
    }
   
}

class GCD implements Runnable{
    int n;
    GCD(int n){
        this.n=n;
    }
   int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
   
    public void run(){
         try{
         for (int i = 1; i <= n; i++) {
                int result = gcd(i, n);
                System.out.println("GCD of " + i + " and " + n + " = " + result);
                Thread.sleep(1000);
             }
    }
     catch(Exception e){
         System.out.println(e);
    }
    }
   

    
}
public class q2{
    public static void main(String[] args) {
        

    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Number: \n");
    int num=sc.nextInt();

    factorial fact=new factorial(num);
    GCD gcd=new GCD(num);
    Thread t1=new Thread(fact);
    Thread t2=new Thread(gcd);
    t1.start();
    t2.start();
    }
}