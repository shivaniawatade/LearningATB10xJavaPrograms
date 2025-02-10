package ex_06_Arrays;
import java.util.Arrays;
public class Lab_045_Second_largest {
    public static void main(String[] args) {
        int[] num={12,23,10,1};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
    }
}
