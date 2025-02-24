package ex_08_Inheritance.example3;

public class Circle extends Shape{
    double radius;
    Circle(String color,String name,double circle_radius){
        super(color,name);
        this.radius=circle_radius;
    }
    double calculatearea(){
        return 3.14*radius*radius;
    }

    @Override
    void display() {
        super.display();
        System.out.println(radius);
        System.out.println(calculatearea());
    }
}
