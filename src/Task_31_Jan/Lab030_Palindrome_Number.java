package Task_31_Jan;
import java.util.*;
public class Lab030_Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num= sc.nextInt();
        int sum=0,a;
        int temp=num;
        while (num>0){
           a=num%10;
           sum=sum*10+a;
           num=num/10;
        }
        if(temp==sum){
            System.out.println("Given Number is Palindrome");
        }
        else{
            System.out.println("Given Number is Not Palindrome");
        }
    }
}
