public class Main {
    public static void main(String[] args) {
        Account acc = new Account("John Doe", 1000);
        acc.credit(500);
        acc.withdraw(200);
        System.out.println("Balance: " + acc.getBalance());
    }
}
class Account {
    private String owner;
    private double balance;

    public Account(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void credit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Credited: " + amount);
        } else {
            System.out.println("Credit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    public double getBalance() {
        return balance;
    }
}