import java.util.Scanner;

public class TestBanking {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Enter your First Name: ");
                String firstName = scan.nextLine();

                System.out.println("Enter your Last Name: ");
                String lastName = scan.nextLine();

                System.out.println("Enter Account Type (1: Saving Account, 2: Checking Account): ");
                String accountType = scan.nextLine();

                System.out.println("Enter account Number: ");
                String accountNumber = scan.nextLine();

                System.out.println("Enter account Balance: ");
                double balance = scan.nextDouble();

                System.out.println("Enter interest rate (%): ");
                double interestRate = scan.nextDouble();

                if (accountType.compareToIgnoreCase("1") == 0) {  // = 0 means are same
                    SavingAccount savingAccount = new SavingAccount(accountNumber, accountType, balance, interestRate);
                    Customer customer = new Customer(firstName, lastName, savingAccount, balance, interestRate);
                    customer.addAccount(savingAccount);
                } else if (accountType.compareToIgnoreCase("2") == 0) {
                    CheckingAccount checkingAccount = new CheckingAccount(accountNumber, accountType, balance, 500.0, 2.0);
                    Customer customer = new Customer(firstName, lastName, checkingAccount, balance, 500.0, 2.0);
                    customer.addAccount(checkingAccount);
                } else {
                    System.out.println("Invalid account type. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid number format. Please try again. ");
            }
        }
    }

    public void withdraw(double amount) throws OverdraftException {
        if (amount > 100) {
            throw new OverdraftException("Inefficient funds", 10.0);
        }
    }
}
