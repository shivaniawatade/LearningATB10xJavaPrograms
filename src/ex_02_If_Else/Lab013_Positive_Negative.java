package ex_02_If_Else;
import java.util.*;
public class Lab013_Positive_Negative {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number to Check whether positive or negative");
        int Number= sc.nextInt();
        if(Number==0){
            System.out.println("0 is considered as Positive number");
        } else if (Number>0) {
            System.out.println(Number + " is positive");
        }
        else {
            System.out.println(Number+" is Negative");
        }
    }
}
