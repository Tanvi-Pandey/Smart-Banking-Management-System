import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        BankService bank =new BankService();
        System.out.println("=======WELCOME TO SMART BANKING SYSTEM=======");

        int choice;
        while (true) {
                System.out.println("\n=====MENU====");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Transfer Money");
                System.out.println("5. View Account Details");
                System.out.println("6. View Transactions");
                System.out.println("7. View All Accounts");
                System.out.println("8. Exit");
                System.out.print("Enter choice: ");

        try { choice =sc.nextInt();}
        catch (Exception e) {
                System.out.println("Invalid input.");
                sc.nextLine();
                continue;}

        if (choice == 8) {
                System.out.println("\nThank you for using Smart Banking System!");
                break;}

        switch (choice) {//Create Account
                case 1://Create Account
                        System.out.print("Enter Account Number: ");
                        int newAccountNumber =sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter Account Holder Name: ");
                        String holderName =sc.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double initialBalance =sc.nextDouble();
                        bank.addAccount(
                            new BankAccount(
                                    newAccountNumber,
                                    holderName,
                                    initialBalance));
                                    break;
                case 2://Deposit
                        System.out.print("Enter Account Number: ");
                        int depositAccount =sc.nextInt();
                        BankAccount depositUser =bank.findAccount(depositAccount);
                        if (depositUser == null) {
                                System.out.println("Account not found.");
                                break;}
                                System.out.print("Enter deposit amount: ");
                        double depositAmount =sc.nextDouble();
                        depositUser.deposit(depositAmount);
                        break;
                case 3://Withdraw
                        System.out.print("Enter Account Number: ");
                        int withdrawAccount =sc.nextInt();
                        BankAccount withdrawUser =bank.findAccount(withdrawAccount);
                        if (withdrawUser == null) {
                                System.out.println("Account not found.");
                                break; }
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount =sc.nextDouble();
                        withdrawUser.withdraw(withdrawAmount);
                        break;
                case 4://Transfer
                        System.out.print("Sender Account Number: ");
                        int senderAccount =sc.nextInt();
                        BankAccount sender =bank.findAccount(senderAccount);
                        if (sender == null) {
                                System.out.println("Sender account not found.");
                                break;}
                        System.out.print("Receiver Account Number: ");
                        int receiverAccount =sc.nextInt();
                        BankAccount receiver =bank.findAccount(receiverAccount);
                        if (receiver == null) {
                                System.out.println("Receiver account not found.");
                                break;}
                        System.out.print("Enter transfer amount: ");
                        double transferAmount =sc.nextDouble();
                        sender.transfer(receiver,transferAmount);
                        break;
                case 5://View Account
                        System.out.print("Enter Account Number: ");
                        int viewAccount =sc.nextInt();
                        BankAccount account =bank.findAccount(viewAccount);
                        if (account == null) {
                                System.out.println("Account not found.");
                                break;}
                        account.displayAccountDetails();
                        break;
                case 6: //View Transactions
                    System.out.print("Enter Account Number: ");
                    int transactionAccount =sc.nextInt();
                    BankAccount transactionUser =bank.findAccount(transactionAccount);
                    if (transactionUser == null) {
                        System.out.println("Account not found.");
                        break;}
                        transactionUser.showTransactions();
                        break;
                case 7://View All Accounts
                        bank.showAllAccounts();
                        break;
                default:
                        System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}