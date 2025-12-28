 import java.util.ArrayList;

public class BankAccount {

    private double balance;
    private ArrayList<String> history = new ArrayList<>();

    BankAccount(double balance) {
        this.balance = balance;
        history.add("Account created with balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            history.add("Withdrawn: " + amount);
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void deposit(double amount) {
        balance += amount;
        history.add("Deposited: " + amount);
        System.out.println("Deposit successful");
    }

    void transfer(double amount) {
        if (amount <= balance) {
            balance -= amount;
            history.add("Transferred: " + amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void showHistory() {
        System.out.println("\nTransaction History:");
        for (String record : history) {
            System.out.println(record);
        }
        System.out.println("Current Balance: " + balance);
    }
}
 
