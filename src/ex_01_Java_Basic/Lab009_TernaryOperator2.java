package ex_01_Java_Basic;

public class Lab009_TernaryOperator2 {
    public static void main(String[] args) {
        int marks = 78;
        String result = ( marks >= 0 && marks <= 59 ) ? "F" : (( marks >= 60 && marks <= 69 ) ? "D" : (( marks >= 70 && marks <= 79) ? "C" : ( (marks >= 80 && marks <= 89) ? "B" : "A" ) )) ;
        System.out.println("Grade is : " + result);
    }
}
