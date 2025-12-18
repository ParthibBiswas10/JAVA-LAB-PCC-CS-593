/*b) To check minimum balance of a Bank account during withdrawal of amount (Let minimum
balance is Rs. 5000/-)*/

import java.util.*;

class MinBalanceException extends Exception {
    public MinBalanceException(String s) {
        super(s);
    }
}

class BankAccount {
    int balance = 10000;  

    void withdraw(int amount) {
        try {
            if (balance - amount < 5000) {
                throw new MinBalanceException("Minimum balance of Rs.5000 must be maintained!");
            } else {
                balance = balance - amount;
                System.out.println("Withdrawal Successful");
                System.out.println("Remaining Balance: Rs." + balance);
            }
        } catch (MinBalanceException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

public class q4b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BankAccount acc = new BankAccount();

        System.out.print("Enter withdrawal amount: ");
        int amount = sc.nextInt();

        acc.withdraw(amount);
    }
}
