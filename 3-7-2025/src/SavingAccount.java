public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber, String accountType, double balance, double interestRate) {
        super(accountNumber, accountType, balance);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println();
        }

        balance -= 2.0;  // Withdraw will got trasactkon fee for RM 2
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return String.format("Account Type: %s\nAccountNumber: %s\nAccount Balance: %.2f\nInterest Rate: %.1f", getAccountType(), getAccountNumber(), getBalance(), getInterestRate());
    }
}
