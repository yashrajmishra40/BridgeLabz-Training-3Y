package OOPsMain;
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String acc, String name, double bal) {
        this.accountNumber = acc;
        this.holderName = name;
        this.balance = bal;
    }

    public void deposit(double amt) { balance += amt; }
    public void withdraw(double amt) { if (amt <= balance) balance -= amt; }
    public abstract double calculateInterest();
}

interface Loanable {
    void applyForLoan(double amt);
    boolean calculateLoanEligibility();
}

class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String acc, String name, double bal) { super(acc, name, bal); }
    public double calculateInterest() { return 0.04 * 10000; }
    public void applyForLoan(double amt) { System.out.println("Applied loan: " + amt); }
    public boolean calculateLoanEligibility() { return true; }
}
