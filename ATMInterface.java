import java.util.Scanner;

public class ATMInterface {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(10000); // initial balance
        ATM atm = new ATM(account);

        System.out.print("Enter User ID: ");
        int userId = sc.nextInt();

        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        if (userId == 1234 && pin == 1111) {
            atm.showMenu();
        } else {
            System.out.println("Invalid User ID or PIN");
        }
        sc.close();
    }
}
