package ex_02_If_Else;

public class Lab012_Palidrome {
    public static boolean isPalindrome(String str) {
        String s = str.toLowerCase();
        String reversed = new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }
    public static void main(String[] args) {
        String string = "naman";
        if (isPalindrome(string)) {
            System.out.println("\"" + string + "\" is a palindrome.");
        } else {
            System.out.println("\"" + string + "\" is NOT a palindrome.");
        }
    }
}
