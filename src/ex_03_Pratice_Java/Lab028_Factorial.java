package ex_03_Pratice_Java;
import java.util.*;
public class Lab028_Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++){
            if (fact == 0) {
                break;
            } else {
                fact = fact * i;
            }

        }
        System.out.println("factorial" +fact );

    }
}
