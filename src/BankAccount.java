import java.util.Scanner;
public class BankAccount {
    static Scanner sc = new Scanner(System.in);
    int balance;
    int previousTransaction;  //  the last amount which is withdrawn/deposited
    String customerName;
    String customerId;

    BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
    }

    void deposit(int amount) {
        if(amount != 0) {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }

    void withdraw(int amount) {
        if(amount != 0) {
            balance = balance - amount;
            previousTransaction = -amount;
        }
    }

    void getPreviousTransaction() {
        if(previousTransaction > 0) System.out.println("Deposited: " + previousTransaction);
        else if(previousTransaction < 0) System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        else System.out.println("No transaction ocurred.");
    }

    void showMenu() {
        char option = '\0';
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println();
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Check Previous Transaction");
        System.out.println("E. Exit");
        System.out.println();
        System.out.println("=======================================================================================================================");
        System.out.println();
        do {
            System.out.println("Enter an option:");
            option = sc.next().charAt(0);
            switch(option) {
                case 'A':
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println();
                    System.out.println("Balance = " + balance);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    break;
                case 'B':
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Enter an amount to deposit:");
                    int amount = sc.nextInt();
                    deposit(amount);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    break;
                case 'C':
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    System.out.println("Enter an amount to withdraw:");
                    int amount2 = sc.nextInt();
                    withdraw(amount2);
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    break;
                case 'D':
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    getPreviousTransaction();
                    System.out.println();
                    System.out.println("--------------------------------------------------");
                    break;
                case 'E':
                    System.out.println("***************************************************************************************");
                    break;
                default:
                    System.out.println("Invalid Option!! Please enter again.");
            }
        } while(option != 'E');
        System.out.println();
        System.out.println("Thank you for using our services!");
        System.out.println();
        System.out.println("=======================================================================================================================");
     }
}
