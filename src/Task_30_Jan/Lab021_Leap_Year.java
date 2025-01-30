package Task_30_Jan;
import java.util.*;
public class Lab021_Leap_Year {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Year to Check whether it is leap year or not: ");
        int Year = sc.nextInt();
        if(Year==0){
            System.out.println("Please enter a valid Year!!!");
        } else if (Year%400==0 || (Year%100 !=0 && Year %4==0)) {
            System.out.println("This is a Leap Year!!");
        }
        else{
            System.out.println("This is Not a Leap Year");
        }
    }
}
