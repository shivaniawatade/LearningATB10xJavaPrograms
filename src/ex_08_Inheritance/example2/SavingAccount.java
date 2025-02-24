package ex_08_Inheritance.example2;

public class SavingAccount extends Account {
    double interest;
    SavingAccount (String accountNumber,double balance ,double interest){
        super(accountNumber,balance);
        this.interest=interest;
    }
    void addinterest(){
        balance += balance * (interest / 100);
        System.out.println(balance);
    }
}
