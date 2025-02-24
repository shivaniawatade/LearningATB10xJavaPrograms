package ex_07_Oops;

public class ConstructorDemo {
    public static void main(String[] args) {
        Constructor c1= new Constructor();
        c1.volume();
    }
}
class Constructor{
    int breadth;
    int width;
    int height;

    Constructor(){
        System.out.println("Constructor without parameter");
        breadth=10;
        width=10;
        height=10;
    }
    Constructor(int a,int b, int c){
        breadth=a;
        width=b;
        height=c;
    }
    int volume(){

        return breadth*width*height;
    }

}
