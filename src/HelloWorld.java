import java.util.*;
public class HelloWorld {
    public static void main(String[] args) {
        int [] array={29,15,49,77,25,89,67,89,};
        int max_value=give_max(array);
        System.out.println(max_value);

    }
    static int give_max(int [] array){
        int max=0;
        for(int i=0;i<array.length-1;i++){
            if(array[i]==array[i+1]){
               max=array[i];
            }
        }
        return max;
    }

}
