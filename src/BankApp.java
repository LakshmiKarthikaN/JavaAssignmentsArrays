
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class Account {
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Withdrawal failed: Insufficient balance!");
        }
        balance -= amount;
        System.out.println("Withdrawn: ₹" + amount);
    }

    public void displayBalance() {
        System.out.println("Current balance for " + accountHolder + ": ₹" + balance);
    }
}


public class BankApp {
    public static void main(String[] args) {
        Account account = new Account("Riya", 5000.0);

        account.displayBalance();

        account.deposit(2000.0);

        try {
            account.withdraw(8000.0);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        account.displayBalance();
    }
}
