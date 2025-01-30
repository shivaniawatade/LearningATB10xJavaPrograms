package Task_30_Jan;
import java.util.*;
public class Lab023_Character_Alphabet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the character:");
        char ch=sc.next().charAt(0);
        if (ch>='a' && ch<='z'|| ch>='A'&& ch<='Z'){
            System.out.println("This "+ ch +" is alphabet");
        }
        else {
            System.out.println("This "+ ch +" is not  a alphabet");
        }
    }


}
