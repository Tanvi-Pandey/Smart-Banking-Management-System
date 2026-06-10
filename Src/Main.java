public class Main {

    public static void main(String[] args) {

System.out.println( //welcome line
        "WELCOME TO SMART BANKING SYSTEM");

BankAccount account1 = // Creating a bank account object
        new BankAccount(
                101,
                "Tanvi",
                5000);
BankAccount account2 =
        new BankAccount(
                102,
                "Vedaant",
                12000);

System.out.println("\nDEPOSIT");
account1.deposit(2000);
account2.deposit(5000);

System.out.println("\nWITHDRAWAL");
account1.withdraw(1000);
account2.withdraw(15000);

System.out.println("\nACCOUNT DETAILS");
System.out.println("Account 1:");
account1.displayAccountDetails();
System.out.println("Account 2:");
account2.displayAccountDetails();

System.out.println("\nTRANSACTION HISTORY");
System.out.println("Account 1 (Tanvi):");
account1.showTransactions();
System.out.println("Account 2 (Rahul):");       
account2.showTransactions();
    }
}