package Task_30_Jan;
import java.util.*;
public class Lab026_Triangle_Validation {
    public static void main(String[] args) {
    int a, b, c;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter length of side");
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if (a + b > c && a + c > b && b + c > a && (a != 0 && b != 0 && c != 0)) {
        System.out.println(" It's a valid triangle");
    } else {
        System.out.println("It is invalid triangle");
    }
}
}
