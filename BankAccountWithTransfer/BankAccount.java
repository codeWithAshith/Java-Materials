package BankAccountWithTransfer;

public class BankAccount {
    private String name;
    private double balance;

    public BankAccount(String name) {
        this.name = name;
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(name + " has balance ₹" + balance);
        System.out.println("--------------");
    }

    public void withdraw(double amount) {
        if (balance > amount) {
            balance -= amount;
            System.out.println(name + " has withdraws ₹" + amount);
            System.out.println(name + " has balance ₹" + balance);
            System.out.println("--------------");
        } else {
            System.out.println(name + " has only ₹" + balance + " in bank");
            System.out.println("--------------");
        }
    }

    public void transfer(double amount, BankAccount bankAccount) {
        if (amount > balance) {
            System.out.println(name + " has only ₹" + balance + " in bank");
            System.out.println("--------------");
        } else {
            balance -= amount;
            bankAccount.balance += amount;
            System.out.println(name + " has transfered ₹" + amount + " to " + bankAccount.name);
            System.out.println(name + " has balance ₹" + balance);
            System.out.println(bankAccount.name + " has balance ₹" + bankAccount.balance);
            System.out.println("--------------");
        }
    }
}
