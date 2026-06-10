public class Main {

    public static void main(String[] args) {

        BankAccount account1 = // Creating a bank account object
                new BankAccount(
                        101,
                        "Tanvi",
                        5000
                );
        BankAccount account2 =
                new BankAccount(
                        102,
                        "Vedaant",
                        12000
                );

        System.out.println(
        "ACCOUNT DETAILS"
);
        System.out.println(
        "\nAccount 1:"
);
account1.displayAccountDetails();

        System.out.println(
        "\nAccount 2:"
);
        account2.displayAccountDetails();

        System.out.println(
        "\nTRANSACTION HISTORY"
);
        System.out.println(
        "Account 1 (Tanvi):"
);
        account1.showTransactions();
        System.out.println(
        "Account 2 (Rahul):"
);       account2.showTransactions();
    }
}