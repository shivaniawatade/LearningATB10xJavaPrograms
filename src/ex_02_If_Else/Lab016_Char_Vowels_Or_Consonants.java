package ex_02_If_Else;
import java.util.*;
public class Lab016_Char_Vowels_Or_Consonants {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        char ch=sc.next().charAt(0);
        if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'||ch=='u'){
            System.out.println("character "+ ch+" is Vowels ");
        }
        else{
            System.out.println("character "+ ch+" is Consonants ");
        }
    }
}
