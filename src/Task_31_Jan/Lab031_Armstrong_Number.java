package Task_31_Jan;
import java.util.*;
import java.lang.Math;
public class Lab031_Armstrong_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num= sc.nextInt();
        int sum=0,a;
        int temp=num;
        String numStr = String.valueOf(num);
        int length = numStr.length();
        while(num>0){
            a=num%10;
            sum= (int) (sum+Math.pow(a,length));
            num=num/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println(" Not Armstrong Number");
        }
    }
}
