public class BankAccount {

    private int accountNumber;  // Private Fields (Encapsulation)
    private String accountHolderName;
    private double balance;

    public BankAccount( // Constructor - Used to initialize object
            int accountNumber,
            String accountHolderName,
            double balance
    )

    {
        this.accountNumber = //parameter
                accountNumber;

        this.accountHolderName =
                accountHolderName;

        this.balance =
                balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }
}