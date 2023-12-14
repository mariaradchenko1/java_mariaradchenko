class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + " внесено на рахунок.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + " знято з рахунку.");
        } else {
            System.out.println("Недостатньо коштів на рахунку.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount {

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

public void withdraw(double amount) {
        if (balance - amount >= 100) {
            balance -= amount;
            System.out.println(amount + " знято з рахунку.");
        } else {
            System.out.println("Недостатньо коштів на рахунку або операція заборонена.");
        }
    }
}

public class hw3 {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(200);
        account1.deposit(100);
        account1.withdraw(50);
        System.out.println("Баланс рахунку 1: " + account1.getBalance());

        SavingsAccount account2 = new SavingsAccount(150);
        account2.deposit(50);
        account2.withdraw(100);
        System.out.println("Баланс рахунку 2: " + account2.getBalance());
    }
}


