package ex_02_If_Else;
import java.util.*;
public class Lab015_Max_Two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the First Number");
        int a=sc.nextInt();
        System.out.println("Enter the Second Number");
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is maximum");
        }
        else{
            System.out.println(b+" is maximum");
        }
    }
}
