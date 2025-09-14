class BankAccount {
    static String bankName = "National Bank";
    private static int totalAccounts = 0;

    private String accountHolderName;
    public final int accountNumber;
    private double balance;

    // Constructor using 'this'
    BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName +
                               ", AccNo: " + accountNumber + ", Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 101, 5000);
        BankAccount acc2 = new BankAccount("Bob", 102, 8000);

        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
