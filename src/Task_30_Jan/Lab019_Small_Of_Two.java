package Task_30_Jan;
import java.util.*;
public class Lab019_Small_Of_Two {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Two Numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        if(a<b){
            System.out.println("Smallest Number is :" +a);
        }
        else {
            System.out.println("Smallest Number is :" +b);
        }
    }
}
