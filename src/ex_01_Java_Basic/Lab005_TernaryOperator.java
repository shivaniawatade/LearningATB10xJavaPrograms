package ex_01_Java_Basic;

public class Lab005_TernaryOperator {
    public static void main(String[] args) {
        int a = 8;
        int b = 5;
        int c = 10;
        int Val = ( a > b ? ( ( a > c) ? a : c) : (  ( b > c) ? b : c) );
        System.out.println("Greatest is : " + Val );
    }
}
