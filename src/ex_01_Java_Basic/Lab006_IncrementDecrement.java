package ex_01_Java_Basic;

public class Lab006_IncrementDecrement {
    public static void main(String[] args) {
        int a=10;
        /*
        ++a = 11 --> a = 11
        a++ = 11 --> a = 12
        a++ = 12 --> a = 13
        adding 11 + 11 + 12 = 34
        */
        System.out.println(++a + a++ + a++);

        int b = 20;
        /*
        --b = 19 --> b = 19
        b++ = 19 --> a = 20
        b-- = 20 --> a = 19
        adding 19 + 19 + 20 = 58
        */
        System.out.println(--b + b++ + b--);

    }
}
