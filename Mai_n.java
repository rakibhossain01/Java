// Custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Custom exception for negative amounts
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}

// BankAccount class with deposit and withdrawal methods
class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot deposit a negative amount");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException, NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException("Cannot withdraw a negative amount");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds for withdrawal");
        }
        balance -= amount;
    }
}

// Main class to demonstrate the functionality
public class BankTransactionSimulator {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000.00); // Initial balance of $1000

        // Simulate transactions
        try {
            System.out.println("Initial balance: $" + account.getBalance());

            account.deposit(500.00); // Deposit $500
            System.out.println("Balance after deposit: $" + account.getBalance());

            account.withdraw(200.00); // Withdraw $200
            System.out.println("Balance after withdrawal: $" + account.getBalance());

            account.withdraw(1500.00); // Attempt to withdraw $1500 (should trigger exception)
        } catch (InsufficientFundsException | NegativeAmountException e) {
            System.err.println("Transaction error: " + e.getMessage());
        } finally {
            System.out.println("Final balance: $" + account.getBalance());
            System.out.println("Transaction processing completed.");
        }
    }
}

