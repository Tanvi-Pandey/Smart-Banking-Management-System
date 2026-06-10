import java.util.ArrayList;

public class BankAccount {

    private int accountNumber;  // Private Fields (Encapsulation)
    private String accountHolderName;
    private double balance;

    private ArrayList<String> transactions;  //Collection to store transactions

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
        transactions =
                new ArrayList<>();
        transactions.add(
                "Account created with Rs."
                        + balance
        );
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

    public void displayAccountDetails() {

    System.out.println(
            "Account Number: "
                    + accountNumber
    );
    System.out.println(
            "Account Holder: "
                    + accountHolderName
    );
    System.out.println(
            "Balance: Rs. "
                    + balance
    );
}

    public void showTransactions() { //shows transactions
    for (String transaction :
            transactions) {

        System.out.println(transaction);
    }
}
}