package Task_30_Jan;
import java.util.*;
public class Lab018_MAX_Three {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Three Numbers:");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if(a>b && a>c){
            System.out.println("Largest :" +a);
        }
        else if (b>c && b>a) {
            System.out.println("Largest :" +b);
        }
        else {
            System.out.println("Largest :" +c);
        }
    }
}
