package ex_06_Arrays;

public class Lab_044_Sum_Array {
    public static void main(String[] args) {
        int sum=0;
        int[] num={3,4,5};
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println("sum"+sum);
    }
}
