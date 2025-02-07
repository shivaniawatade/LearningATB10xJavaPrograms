package ex_03_Pratice_Java;
import java.util.*;
public class Lab027_Reverse_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int number=sc.nextInt();
        int sum=0;
        int a;
        while(number>0) {
            a = number % 10;
            sum = a+ sum*10;
            number = number / 10;
        }
        System.out.println(sum);
    }
}
