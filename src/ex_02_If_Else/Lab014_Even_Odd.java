package ex_02_If_Else;
import java.util.*;
public class Lab014_Even_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number :");
        int Number=sc.nextInt();
        if(Number%2==0){
            System.out.println("Given Number "+Number+" is Even");
        }
        else{
            System.out.println("Given Number "+Number+" is Odd");
        }
    }
}
