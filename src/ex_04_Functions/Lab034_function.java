package ex_04_Functions;
public class Lab034_function {
    public static void main(String[] args) {
        // without parameter and without argument
        greet();
        //without parameter but with return type
        String s= great_with_hello();
        System.out.println(s);
        //with parameter but without return type
        sum(23,67);
        //with parameter and with return type
        int d=sum(12,34,8);
        System.out.println(d);
    }
    // without parameter and without argument
    static void greet(){
        System.out.println("Hi");
    }
    //without parameter but with return type
    static String great_with_hello(){
        return "Hello Shivani";
    }
    //with parameter but without return type
    static void sum(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    //with parameter and with return type
    static int sum(int p,int q,int r){
        return p+q+r;

    }




}
