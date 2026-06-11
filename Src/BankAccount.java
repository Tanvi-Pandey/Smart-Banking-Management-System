import java.util.ArrayList;

public class BankAccount {

    private int accountNumber;  // Private Fields (Encapsulation)
    private String accountHolderName;
    private double balance;

    private ArrayList<String> transactions;  //Collection to store transactions

    private static final String CURRENCY ="Rs. "; //always prints with rs.

    public BankAccount( // Constructor - Used to initialize object
            int accountNumber,
            String accountHolderName,
            double balance)

    {   this.accountNumber = //parameter
                accountNumber;
        this.accountHolderName =
                accountHolderName;
        this.balance =
                balance;
        transactions =
                new ArrayList<>(); //without this NullPointerException
        transactions.add(
                "Account created with "
                        + CURRENCY
                        + balance);
    }

    public int getAccountNumber() {
        return accountNumber;}
    public String getAccountHolderName() {
        return accountHolderName;}
    public double getBalance() {
        return balance;}

    public void displayAccountDetails() {
    System.out.println(
            "Account Number: "
                    + accountNumber);
    System.out.println(
            "Account Holder: "
                    + accountHolderName);
    System.out.println(
            "Current Balance: "
                     + CURRENCY
                     + balance);
}

public void showTransactions() {
        if (transactions.isEmpty()) {
                System.out.println("No transactions found.");
                return;}
                System.out.println("\nTRANSACTION HISTORY");
        for (String transaction :transactions) {
                System.out.println(transaction);}  }

public boolean deposit(double amount) {

        if (amount <= 0) {
                System.out.println("Invalid deposit amount.");
                return false;}

        balance += amount;

        addTransaction("Deposit: + "+ CURRENCY+ amount);

        System.out.println("\nDeposit Successful!");
        System.out.println("Account Holder: "+ accountHolderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Deposited Amount: "+ CURRENCY+ amount);
        System.out.println("Updated Balance: "+ CURRENCY+ balance);

        return true;  }

public boolean withdraw(double amount) {
        if (amount <= 0) {
                System.out.println("Invalid withdrawal amount.");
                return false;}
        if (amount > balance) {
                System.out.println("\nWithdrawal Failed!");
                System.out.println("Account Holder: "+ accountHolderName);
                System.out.println("Insufficient balance.");
                return false;}

        balance -= amount;

        addTransaction("Withdrawal: - "+ CURRENCY+ amount);

        System.out.println("\nWithdrawal Successful!");
        System.out.println("Account Holder: "+ accountHolderName);
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Withdrawn Amount: "+ CURRENCY+ amount);
        System.out.println("Remaining Balance: "+ CURRENCY+ balance);
        return true;}

public boolean transfer(
        BankAccount receiver,
        double amount) {

        if (receiver == null) {
                System.out.println("Receiver account not found.");
                return false;}
        if (amount <= 0) {
                System.out.println("Invalid transfer amount.");
                return false;}
        if (amount > balance) {
                System.out.println("Insufficient balance.");
                return false;}

        balance -= amount;
        receiver.balance += amount;

        addTransaction("Transfer To A/C "+ receiver.accountNumber+ ": - "+ CURRENCY+ amount);
        receiver.addTransaction("Received From A/C "+ accountNumber+ ": + "+ CURRENCY+ amount);

        System.out.println("\nTransfer Successful!");
        System.out.println("Transferred "+ CURRENCY+ amount);
        System.out.println("To Account Number: "+ receiver.accountNumber);

        return true;
}
        private void addTransaction(String transaction) {
                transactions.add(transaction);}
      
}