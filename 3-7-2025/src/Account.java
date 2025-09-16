abstract class Account implements AccountStuff{
    private String accountNumber;
    private String accountType;
    protected double balance; // only can acces by the subclass

    protected Account(String accountNumber, String accountType, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void deposit(double amount) {

    }

    public void withdraw(double amount) {

    }
}
