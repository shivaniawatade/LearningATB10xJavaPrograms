package ex_09_Abstraction;

public class LAb056_AnimalDemo {
    public static void main(String[] args) {
     Dog g=new Dog();
     g.details();
    }
}
abstract class Animal{
    abstract void barking();

    void sleep(){
        System.out.println("Sleeping");
    }
}
class Dog extends Animal{
    @Override
    void barking() {
        System.out.println("barking");
    }
    void details(){
        barking();
        System.out.println("eating");
        sleep();
    }
}
