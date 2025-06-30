import java.util.ArrayList;

public class Account {
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactions;

    public Account(String accountHolder) {
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactions.add("Deposited: ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactions.add("Withdrew: ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void showTransactions() {
        System.out.println("Transaction History for " + accountHolder + ":");
        for (String transaction : transactions) {
            System.out.println(transaction);
        }
    }
}
