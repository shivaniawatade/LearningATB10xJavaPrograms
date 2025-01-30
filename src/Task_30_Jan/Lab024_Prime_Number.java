package Task_30_Jan;
import java.util.*;
public class Lab024_Prime_Number {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num = sc.nextInt();
        boolean prime= true;
        if(num<=1){
            prime =false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0) {
                prime=false;
                break;
            }

        }
        if (prime){
            System.out.println(num+" is a prime Number");
        }
        else{
            System.out.println(num+" is not a prime Number");
        }

    }
}
