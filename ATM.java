import java.util.*;

class BankAccount {
    private double balance;

    public BankAccount(double bal) {
        balance = bal;
    }

    void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    void withdraw(double amt) {
        if (amt > 0 && amt <= balance) balance -= amt;
        else System.out.println("Insufficient balance or invalid amount");
    }

    void showBalance() {
        System.out.println("Balance: ₹" + balance);
    }
}

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount(5000);
        int choice;

        do {
            System.out.println("\n1. Balance 2. Deposit 3. Withdraw 4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> acc.showBalance();
                case 2 -> { System.out.print("Deposit amount: "); acc.deposit(sc.nextDouble()); }
                case 3 -> { System.out.print("Withdraw amount: "); acc.withdraw(sc.nextDouble()); }
                case 4 -> System.out.println("Thank you!");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 4);
        sc.close();
    }
}