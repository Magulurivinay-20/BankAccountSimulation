public class Main {
    public static void main(String[] args) {
        Account acc = new Account("Vinay");

        acc.deposit(1000);
        acc.withdraw(300);
        acc.deposit(500);
        acc.withdraw(1500); // Invalid

        System.out.println("Current Balance: ₹" + acc.getBalance());
        acc.showTransactions();
    }
}
