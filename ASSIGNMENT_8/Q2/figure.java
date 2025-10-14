import java.util.Scanner;
import mypack.shape;
public class figure{
    public static void main(String[] args) {
        shape obj=new shape();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side of Square: ");
        double a=sc.nextDouble();
        System.out.println("Area of Square: "+obj.getarea(a));
         System.out.println("Enter Length of Rectangle: ");
        double l=sc.nextDouble();
         System.out.println("Enter width of Rectangle: ");
        double w=sc.nextDouble();
          System.out.println("Area of Rectangle: "+obj.getarea(l,w));
         System.out.println("Enter Radius of Square: ");
        double r=sc.nextDouble();
          System.out.println("Area of Circle: "+obj.getarea(r,'c'));

    }

}