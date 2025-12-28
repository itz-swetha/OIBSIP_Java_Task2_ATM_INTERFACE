import java.util.Scanner;

public class ATM {
    
    private BankAccount account;
    Scanner sc = new Scanner(System.in);

    ATM(BankAccount account) {
        this.account = account;
    }

    void showMenu() {
        int choice;
        do {
            System.out.println("\n--- ATM MENU ---");
            System.out.println("1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Quit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> account.showHistory();
                case 2 -> withdraw();
                case 3 -> deposit();
                case 4 -> transfer();
                case 5 -> System.out.println("Thank you for using ATM");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 5);
    }

    void withdraw() {
        System.out.print("Enter amount to withdraw: ");
        double amount = sc.nextDouble();
        account.withdraw(amount);
    }

    void deposit() {
        System.out.print("Enter amount to deposit: ");
        double amount = sc.nextDouble();
        account.deposit(amount);
    }

    void transfer() {
        System.out.print("Enter amount to transfer: ");
        double amount = sc.nextDouble();
        account.transfer(amount);
    }
}
