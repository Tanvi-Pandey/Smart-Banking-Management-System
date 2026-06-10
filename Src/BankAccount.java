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

    public void showTransactions() { //shows transactions
    for (String transaction :
            transactions) {
        System.out.println(transaction);}
}

public void deposit(
        double amount
) {
    if (amount > 0) { //banks don't aloow -ve deposition
        balance += amount; //balance updation
        transactions.add(
                "Amount Deposited "
                        + CURRENCY
                        + amount);
        System.out.println(
                CURRENCY
                        + amount
                        + " deposit successfull.");
        System.out.println(
                "Account Holder: "
                        + accountHolderName);
        System.out.println(
                "Account Number: "
                        + accountNumber);
        System.out.println(
                "Deposited Amount: "
                        + CURRENCY
                        + amount);
        System.out.println(
                "Updated Balance: "
                        + CURRENCY
                        + balance       );}
        else {
        System.out.println("Invalid deposit amount.");}
    }

public void withdraw(double amount){
    if (amount <= 0) {
        System.out.println("Invalid withdrawal amount.");
        return;}
    if (amount > balance) {
        System.out.println("\nWithdrawal Failed!");
        System.out.println(
                "Account Holder: "+ accountHolderName);
        System.out.println("Insufficient balance.");
        return;}
    balance -= amount; //update balance
    transactions.add(
            "Withdrawal: - "+ CURRENCY+ amount);
System.out.println("\nWithdrawal Successful!");
System.out.println( "Account Holder: "+ accountHolderName);
System.out.println("Account Number: "+ accountNumber);
System.out.println("Withdrawn Amount: "+ CURRENCY+ amount);
System.out.println("Remaining Balance: "+ CURRENCY+ balance);}
}