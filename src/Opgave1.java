import java.util.Scanner;

public class Opgave1 {
    double balance = 100.0;
    String accountName = "John Cool";
    Scanner input = new Scanner(System.in);

    void main() {
        System.out.println("Welcome to LaundryBank");

        while (true) {
            System.out.println();
            System.out.println("Deposit or withdraw?");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Exit");
            int choice = input.nextInt();
            if (choice == 1) {
                System.out.println("How much money would you like to deposit?");
                deposit(input.nextDouble());
            } else if (choice == 2) {
                System.out.println("How much money would you like to withdraw?");
                withdraw(input.nextDouble());
            } else if (choice == 3) {
                System.out.println("Goodbye, thank you for choosing LaundryBank!");
                return;
            } else {
                System.out.println("Not a valid entry");
            }
        }
    }

    public void deposit(double money) {
        System.out.println();
        balance += money;
        System.out.println("You deposited " + money + "kr.");
        printBalance();
    }

    public void withdraw(double money) {
        System.out.println();
        balance -= money;
        System.out.println("You withdrew " + money + "kr.");
        printBalance();
    }

    public void printBalance() {
        System.out.println();
        System.out.println(accountName);
        System.out.println("Your balance: " + balance);
    }
}