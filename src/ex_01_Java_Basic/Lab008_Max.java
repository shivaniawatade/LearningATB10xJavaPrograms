package ex_01_Java_Basic;

public class Lab008_Max {
    public static void main(String[] args) {
        int val1 = Integer.parseInt(args[0]);
        int val2 = Integer.parseInt(args[1]);

        String result = val1 > val2 ? "value 1 is maximum" : "value 2 is maximum";
        System.out.println(result);

    }
}
