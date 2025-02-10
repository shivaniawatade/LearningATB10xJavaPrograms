package Task_31_Jan;
import java.util.*;
public class Lab_041_Bonus_Calculate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Salary:");
        double salary=sc.nextDouble();
        System.out.println("Enter the Year:");
        double year=sc.nextDouble();
        double bonus=0;
        if(year<1){
            System.out.println("No bonus");
        } else if (year>=1 && year<=3) {
            bonus=salary*0.05;
        } else if (year>=4 && year<=6) {
            bonus=salary*0.1;
        }
        else {
            bonus=salary*0.15;
        }
        System.out.println(bonus);
    }
}
