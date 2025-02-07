package Task_31_Jan;
import java.util.*;
public class Lab032_Loan_Eligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        final int min_age=18;
        final int max_age=80;
        final int min_salary=30000;
        final int min_credit_score=650;
        final int max_credit_score=850;
        boolean is_eligible=true;
        System.out.println("Enter the Age:");
        int age=sc.nextInt();
        System.out.println("Enter the Salary:");
        int salary=sc.nextInt();
        System.out.println("Enter the Credit Score");
        int credit_score=sc.nextInt();
        // Age validation
        if(age<0){
            is_eligible=false;
            System.out.println("Age must be positive number");
        }
        else if(age<min_age){
            is_eligible=false;
            System.out.println("You must be at least 18 years old.");
        } else if (age>max_age) {
            is_eligible=false;
            System.out.println("Age cannot exceed 80 years.");
        }
        //salary validation
        if (salary<0){
            is_eligible=false;
            System.out.println("salary must be Positive number:");
        } else if (salary<min_salary) {
            is_eligible= false;
            System.out.println("Minimum salary requirement not met.");
        }
        // credit score validation
        if(credit_score<0){
            is_eligible=false;
            System.out.println("credit_score must be Positive number.");
        } else if (credit_score<min_credit_score) {
            is_eligible=false;
            System.out.println("Credit score too low.");
        } else if (credit_score>max_credit_score) {
            is_eligible=false;
            System.out.println("credit score cannot exceeds 850.");
        }
        if(is_eligible){
            System.out.println("\nCongratulations! You are eligible for a loan.");
            System.out.println("Age: " + age);
            System.out.println("Salary: $" + salary);
            System.out.println("Credit Score: " + credit_score);
        }
        else{
            System.out.println("\nSorry, you are not eligible for a loan.");
        }
    }
}
