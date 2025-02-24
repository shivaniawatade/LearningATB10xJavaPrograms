package ex_07_Oops;

public class Constructors {
    public static void main(String[] args) {
         Car2 c1= new Car2("XYZ",2000);
         c1.display();

         Car2 c2= new Car2("Tesla", 2003);
         c2.display();;
         Car2 c3= new Car2("Nano");
         c3.display();

    }
}
class Car2{
    String model; int year;
    Car2(String model,int year){
        this.model=model;
        this.year=year;
    }
    Car2(String model){

        this.model=model;
    }
    void display(){
        System.out.println(this.model);
        System.out.println(this.year);
    }
}
