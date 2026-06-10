public class Main {

    public static void main(String[] args) {

        BankAccount account1 = // Creating a bank account object
                new BankAccount(
                        101,
                        "Tanvi",
                        5000
                );


        System.out.println(
                "ACCOUNT DETAILS"
        );

        System.out.println(
                "Account Number: "
                        + account1.getAccountNumber()
        );

        System.out.println(
                "Account Holder: "
                        + account1.getAccountHolderName()
        );

        System.out.println(
                "Balance: Rs."
                        + account1.getBalance()
        );
    }
}