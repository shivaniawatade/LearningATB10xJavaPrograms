package ex_02_If_Else;
import java.util.*;
public class Lab017_Eligible_For_Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age:");
        int age= sc.nextInt();
        if(age<0){
            System.out.println("Please Enter the valid Age");
            return;
        }
        else if (age>=18){
            System.out.println(" Person is Eligible to Vote");
        }
        else{
            System.out.println(" Person is  Not Eligible to Vote");
        }
        sc.close();
    }

}
