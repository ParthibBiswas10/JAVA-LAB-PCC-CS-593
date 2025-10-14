import calculation.operations;
import java.util.Scanner;
public class TwoOperations{

    public static void main(String[] args) {
        operations obj=new operations();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num 1: ");
        int num1=sc.nextInt();
        System.out.println("Enter num 2: ");
        int num2=sc.nextInt();
        System.out.println("Sum of Integers: "+ obj.sum(num1,num2));
        System.out.println("Multiplication of Integers: "+ obj.mul(num1,num2));

        System.out.println("Enter double  num 1: ");
        double num3=sc.nextDouble();
        System.out.println("Enter double  num 2: ");
        double num4=sc.nextDouble();
        System.out.println("Sum of Doubles: "+ obj.sum(num3,num4));
        System.out.println("Multiplication of Doubles: "+ obj.mul(num3,num4));



    }
}