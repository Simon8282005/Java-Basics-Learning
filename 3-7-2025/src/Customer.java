import java.util.ArrayList;

public class Customer {
    private String firstName;
    private String lastName;

    ArrayList<Account> accountList = new ArrayList<>();
    //private Account account;

    public Customer(String firstName, String lastName, Account account) {
        setFirstName(firstName);
        setLastName(lastName);
        addAccount(account);
    }

    public Customer(String firstName, String lastName, Account account, double balance, double interest) {
        setFirstName(firstName);
        setLastName(lastName);
        addAccount(account);

    }

    public Customer(String firstName, String lastName, Account account, double balance, double overdraft, double fee) {
        setFirstName(firstName);
        setLastName(lastName);
        addAccount(account);

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void addAccount(Account account) {
        this.accountList.add(account);
    }

}