package encapsulation;
class BankAccount {
    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class prgm2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.deposit(1000);
        account.withdraw(400);

        double balance = account.getBalance();
        System.out.println("Current Balance:" + balance);
    }
}
