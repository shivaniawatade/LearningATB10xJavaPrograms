package ex_06_Arrays;
import java.util.*;
public class LAb_042_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array={25,14,56,15,36,56,77,18,29,49};
        int max_output= give_max(array);
        System.out.println(max_output);
        int min_output= give_min(array);
        System.out.println(min_output);
        duplicate(array);


    }
    static int give_max(int[] array){
        int max=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
    static int give_min(int[] array){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        return min;
    }
    static void duplicate(int[] array){
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
