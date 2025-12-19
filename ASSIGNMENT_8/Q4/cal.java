import java.util.Scanner;
import mathcal.FactGCD;
import mathcal.mathcheck.prime;
public class cal{
    public static void main(String[] args) {
        FactGCD obj=new FactGCD();

        Scanner sc=new Scanner(System.in);
       
        System.out.println("Enter num 1 : ");
        int num1=sc.nextInt();  
        System.out.println("Enter num 2: ");
        double num2=sc.nextInt();
        System.out.println("Factorial of "+num1+" is: "+obj.calFactorial(num1));
        System.out.println("GCD of "+num1+" and "+(int)num2+" is: "+obj.calGCD((int)num1, (int)num2));

        prime p = new prime();
        System.out.println("Enter a number to check if prime or not : ");
        int x = sc.nextInt();
        if (p.isPrime(x)==1)
            System.out.println(x + " is a Prime number.");
        else
            System.out.println(x + " is NOT a Prime number.");
    }
}