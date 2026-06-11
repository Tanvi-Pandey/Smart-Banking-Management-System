import java.util.HashMap;

public class BankService {
    
    private HashMap<Integer, BankAccount> accounts;

    public BankService() {
        accounts =new HashMap<>();}

    public void addAccount(
        BankAccount account) {
        accounts.put(
            account.getAccountNumber(),account);
        System.out.println("Account created successfully."); }

    public BankAccount findAccount(int accountNumber){
        return accounts.get(
            accountNumber); }

    public void showAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.");
            return;}
        System.out.println("\nALL ACCOUNTS");
        for (BankAccount account :accounts.values()) {
            account.displayAccountDetails();}
    }
}
