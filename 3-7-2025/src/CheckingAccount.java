public class CheckingAccount extends Account {
    private double overdraftAmount;
    private double transactionFee;

    public CheckingAccount(String accountNumber, String accountType, double balance, double overdraftAmount, double transactionFee) {
        super(accountNumber, accountType, balance);
        setOverdraftAmount(overdraftAmount);
        setTransactionFee(transactionFee);
    }

    public void setOverdraftAmount(double overdraftAmount) {
        this.overdraftAmount = overdraftAmount;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public double getOverdraftAmount() {
        return overdraftAmount;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance < amount) {
            double overdraftNeeded = amount - balance;

            if (overdraftAmount < overdraftNeeded) {
                try {
                    throw new OverdraftException("Insufficient funds. Exceeding the minimum balance.", overdraftNeeded);
                } catch (OverdraftException e) {
                    System.out.println("Please try agian..");
                }
            }
        }
    }

    @Override
    public String toString() {
        return String.format("Account Type: %s\nAccountNumber: %s\nAccount Balance: %.2f\nOverdraft Protection: %.2f\nTransaction Fee: %.1f",
                getAccountType(), getAccountNumber(), getBalance(), getOverdraftAmount(), getTransactionFee());
    }

    public void testingError() throws OverdraftException {
        if (getOverdraftAmount() == 0) {
            throw new OverdraftException("Hello World", 1.0);
        }
    }
}
