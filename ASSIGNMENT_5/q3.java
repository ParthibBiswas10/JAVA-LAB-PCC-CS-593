/*5.3 Write a program to use a class Account with the following specifications:
Class name — Account
Data members — int acno, float balance
Member Methods:
1. Account (int a, int b) — to initialize acno = a, balance = b
2. void withdraw(int w) — to maintain the balance with withdrawal (balance - w)
3. void deposit(int d) — to maintain the balance with the deposit (balance + d)
Use another class Calculate which inherits from class Account with the following specifications:
Data members — int r,t ; float si,amt;
Member Methods:
1. void accept(int x, int y) — to initialize r=x,t=y,amt=0
2. void compute() — to find simple interest and amount
si = (balance * r * t) / 100;
a = a + si;
3. void display() — to print account number, balance, interest and amount */

import java.util.*;
class Account{
    int acno;
    float balance;
    
    Account(int a, float b){
        this.acno=a;
        this.balance=b;
    }
    void withdraw(int w){
        balance=balance-w;
    }
    void deposit(int d){
        balance=balance+d;
    }

}
class Calculate extends Account{
    Calculate(int a, float b){
        super(a, b);
    }
    int r,t;
    float si,amt;
    void accept(int x, int y){
        this.r=x;
        this.t=y;
        amt=0;
     }
    void compute(){
        si = (balance * r * t) / 100;
        balance=balance+si;
    }
    void display(){
        System.out.println("Account Number: "+acno);
        System.out.println("Balance: "+balance);
        System.out.println("Rate of Interest: "+r);
        System.out.println("Time Period: "+t);
        System.out.println("Simple Interest: "+si);
        System.out.println("Total Amount: "+amt);
    }

}
public class q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter account number: ");
        int acno = sc.nextInt();
        System.out.print("Enter initial balance: ");
        float balance = sc.nextFloat();
        //Account acc = new Account(acno, balance);
        Calculate calc = new Calculate(acno, balance);
        System.out.print("Enter rate of interest: ");
        int r = sc.nextInt();
        System.out.print("Enter time period: ");
        int t = sc.nextInt();
        System.out.println("Enter WithDraw Amount: ");
        int w = sc.nextInt();
        calc.withdraw(w);
        System.out.println("Enter Deposit Amount: ");
        int d = sc.nextInt();
        calc.deposit(d);
        calc.accept(r, t);
        calc.compute();
        calc.display();
        sc.close();
    }
}


/*why Calculate(int a, float b){
        super(a, b);
    } line??

    well, by writing Calculate calc = new Calculate(acno, balance) we're calling the parametreized constructur of Calculate...calculate extends account class, so by default it call non parameterized constructor of account !! 

    if we set acno and balance by Account acc = new Account(acno, balance);, we can only set values to the Parent class...as calculate extends acc, cal only copy he values from account class not the values...so in cal classs ac no and balance will be 0 !!

    this is the reason, we need to call the parameterized constructor of the Calculate class to ensure that both the parent and child class variables are initialized properly.

    */