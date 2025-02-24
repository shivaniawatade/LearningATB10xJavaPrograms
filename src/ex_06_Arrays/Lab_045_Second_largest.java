package ex_06_Arrays;
import java.util.Arrays;
public class Lab_045_Second_largest {
    public static void main(String[] args) {
        int[] num={12,23,10,1};
        Arrays.sort(num);
        System.out.println(num[num.length-2]);
        System.out.println(num[1]);

        // without using sort method

        int [] array={12,23,6,1,45};
        int temp;
        for(int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]>array[j]){
                    temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(array[array.length-2]);
        System.out.println(array[1]);

    }
}
