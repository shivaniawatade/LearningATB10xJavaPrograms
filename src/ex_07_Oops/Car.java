package ex_07_Oops;

public class Car {
    public static void main(String[] args) {
        CarDemo c1=new CarDemo();
        c1.details();
    }

}
class CarDemo {
    String name;
    int Year;
    String Model;

    CarDemo() {
        name = "Thar";
        Year = 2000;
        Model = "XYZ";
    }
    void details(){
        System.out.println("name: "+name);
        System.out.println("Year: "+Year);
        System.out.println("Model: "+ Model);
    }
}