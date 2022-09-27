package BankAccountWithTransfer;

public class Main {
    public static void main(String[] args) {
        BankAccount andy = new BankAccount("Andy");
        andy.deposit(500);

        BankAccount smith = new BankAccount("Smith");
        smith.deposit(1000);

        smith.withdraw(500);
        andy.transfer(300, smith);
    }
}
