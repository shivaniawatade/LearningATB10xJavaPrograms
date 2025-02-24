package ex_08_Inheritance.Multilevel;

public class Lab53_Vehicle {
    public static void main(String[] args) {
        ElectricCar e1=new ElectricCar("Mahindra",2000,4,100);
        e1.display();
        Car c1= new Car("XUV",2024,4);
        c1.display();

    }
}
class Vehicle{
    String brand;
    int year;

    Vehicle(String brand,int year){
        this.brand=brand;
        this.year=year;
    }
    void display(){
        System.out.println("brand "+brand+"\n"+"year "+year);
    }

}
class Car extends Vehicle{
    int doors;
    Car(String brand,int year,int doors){
      super(brand,year);
      this.doors=doors;
    }
    void display(){
        super.display();
        System.out.println("car is running and have"+ doors+"doors");
    }
}
class ElectricCar extends Car{
    int battery;
    ElectricCar(String brand,int year,int doors,int battery ){
        super(brand,year,doors);
        this.battery=battery;
    }

    @Override
    void display() {
        super.display();
        System.out.println("battery is full");
    }
}
