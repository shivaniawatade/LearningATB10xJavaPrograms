package Task_30_Jan;
import java.util.*;
public class Lab020_Small_Of_Three {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Three Numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if (a<b && a<c){
            System.out.println("Smallest Number is " +a);
        } else if (b<a && b<c) {
            System.out.println("Smallest Number is " +b);
        }
        else{
            System.out.println("Smallest Number is " +c);
        }
    }
}
