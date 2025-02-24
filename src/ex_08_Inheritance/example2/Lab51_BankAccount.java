package ex_08_Inheritance.example2;

public class Lab51_BankAccount {
    public static void main(String[] args) {
        SavingAccount savings = new SavingAccount("SA001", 1000.0, 2.5);
        savings.deposit(500.0);
        savings.addinterest();
    }
}
