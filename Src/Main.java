import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("WELCOME TO SMART BANKING SYSTEM");

        BankAccount account1 = // Create account
        new BankAccount(
                101,
                "Tanvi",
                5000);

        int choice;
        while (true) {
                System.out.println("\nMENU");
                System.out.println("1. Deposit Money");
                System.out.println("2. Withdraw Money");
                System.out.println("3. View Account Details");
                System.out.println("4. View Transactions");
                System.out.println("5. Exit");
                System.out.print("Enter choice: ");

                choice =sc.nextInt();
                switch (choice) {
                        case 1:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount =sc.nextDouble();
                        account1.deposit(depositAmount);
                        break;

                        case 2:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount =sc.nextDouble();
                        account1.withdraw(withdrawAmount);
                        break;
                        case 3:
                        System.out.println("\nACCOUNT DETAILS");
                        account1.displayAccountDetails();
                        break;
                        case 4:
                        System.out.println("\n=TRANSACTION HISTORY");
                        account1.showTransactions();
                        break;
                        case 5:
                        System.out.println("\nThank you for using Smart Banking System!");
                        sc.close();
                        return;
                        
                        default:
                        System.out.println("Invalid choice.");
            }
        }
    }
}