package ex_08_Inheritance.example2;

public class Account {
    double balance;
    String accountNumber;
    Account(String accountNumber,double balance ){
        this.balance=balance;
        this.accountNumber=accountNumber;
    }
    void deposit(double amount){
        balance+=amount;
        //System.out.println(balance);
    }
}
