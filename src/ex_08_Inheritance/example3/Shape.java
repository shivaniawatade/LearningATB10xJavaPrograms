package ex_08_Inheritance.example3;

public class Shape {
    String color;
    String name;

    Shape(String color,String name){
        this.color=color;
        this.name=name;
    }
    void display(){
        System.out.println(color);
        System.out.println(name);
    }
}
