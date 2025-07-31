
import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + " | Balance: " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Error: Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + " | Balance: " + balance);
        }
    }
}

public class SimpleBanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        while (true) {
            System.out.println("\n1.Deposit  2.Withdraw  3.Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    account.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Thank you for banking!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
