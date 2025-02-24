package ex_09_Abstraction;

public class Lab055_AC {
    public static void main(String[] args) {
        WagnoR w= new WagnoR();
        w.drive();
    }
}
abstract class Engine{
    abstract void startengine();
    void stop(){
        System.out.println("Stop");
    }
}
class WagnoR extends Engine{
    @Override
    void startengine() {
        System.out.println("Start");
    }
    void drive(){
        startengine();
        System.out.println("I am driving");
        stop();
    }
}