import java.util.Scanner;
public class BankingApplication {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name = sc.nextLine();
        System.out.print("Enter the ID: ");
        String id = sc.nextLine();
        BankAccount obj = new BankAccount(name, id);
        obj.showMenu();
    }
}