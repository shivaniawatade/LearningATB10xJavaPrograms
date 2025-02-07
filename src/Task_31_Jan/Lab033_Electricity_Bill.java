package Task_31_Jan;
import java.util.*;
public class Lab033_Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit= sc.nextInt();
        double bill;
        if(unit<0){
            System.out.println("please enter a positive unit.");
        }
        if(unit>0 && unit<=100){
            bill=unit*0.50;
            System.out.println("₹"+bill);
        }
        else if(unit>=101 && unit<=200){
            bill=unit*0.75;
            System.out.println("₹"+bill);
        }
        else if(unit>=201 && unit<=300){
            bill=unit*1.20;
            System.out.println("₹"+bill);
        } else if (unit>=300) {
            bill=unit*1.50;
            System.out.println("₹"+bill);
        }

    }
}
