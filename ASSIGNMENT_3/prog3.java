import java.util.*;
class loan{
    int time;
    double principal,rate,interest,amt;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        principal = sc.nextDouble();
        System.out.print("Enter time in years: ");
        time = sc.nextInt();
    }
    void calculate(){
        if (time <= 5) {
            rate = 15;
        } else if (time <= 10) {
            rate = 12;
        } else {
            rate = 10;
        }

        // Calculate interest
        interest = (principal * rate * time) / 100;

        // Calculate total amount
        amt = principal + interest;
    }
    void display(){
        System.out.println("\nPrincipal: Rs. " + principal);
        System.out.println("Time: " + time + " years");
        System.out.println("Rate of Interest: " + rate + "%");
        System.out.println("Interest: Rs. " + interest);
        System.out.println("Total Amount to Pay: Rs. " + amt);
    }
}
public class prog3{
    public static void main(String[] args) {
       
        loan obj=new loan();
       
        obj.getdata();
        obj.calculate();
        obj.display();
    }
}