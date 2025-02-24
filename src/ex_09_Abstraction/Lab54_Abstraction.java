package ex_09_Abstraction;

public class Lab54_Abstraction {
    public static void main(String[] args) {
        PrintMyBook p=new PrintMyBook("Harry Potter","J.K.Rowling",100);
        p.getdetails();

    }
}
abstract class Book{
    abstract void getdetails();
    String name;
    String author;
    int price;
}
class PrintMyBook extends Book{
    PrintMyBook(String name, String author,int price){
        this.name=name;
        this.author=author;
        this.price=price;
    }
    void getdetails(){
        System.out.println("name"+name+ "\n" +"Author"+author+"\n"+"price"+price);
    }

}
