package ex_02_If_Else;
import java.util.*;
public class Lab011_Vowels_Consonants {
    public static void main(String[] args) {Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the String:");
        String s = sc.nextLine();
        String str=s.toLowerCase();
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
          char ch= str.charAt(i);
          if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u'){
              v++;
          }
          else{
              c++;
          }
        }
        System.out.println("Number of Vowels:"+ v);
        System.out.println("Number of Consonants:"+ c);
    }
}
