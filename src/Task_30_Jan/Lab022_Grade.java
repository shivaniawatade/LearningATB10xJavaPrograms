package Task_30_Jan;
import java.util.*;
public class Lab022_Grade {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Marks:");
        int marks= sc.nextInt();
        if(marks <0 || marks >100){
            System.out.println("please enter the Marks between 0 to 100 ");
        }
        else if (marks>=90 && marks<=100) {
            System.out.println("Grade : A+");
        }
        else if (marks>=80 && marks<=89) {
            System.out.println("Grade : A");
        }
        else if (marks>=70 && marks<=79) {
            System.out.println("Grade : B");
        }
        else if (marks>=60 && marks<=69) {
            System.out.println("Grade : C");
        }
        else if (marks>50 && marks<=59) {
            System.out.println("Grade : D");
        }
        else if (marks>=40 && marks<=49) {
            System.out.println("Grade : E");
        }
        else {
                System.out.println("Grade : Fail");

        }
    }

}
