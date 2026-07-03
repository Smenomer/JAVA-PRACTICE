package smenomer;
import java.util.Arrays;
public class Swap {
    public static void main(String [] args){
        int[] arr= {11,22,33,44,55,66,77,88};
        swap(arr,0,7);

        System.out.println(Arrays.toString(arr));

    }
        static void swap(int[] arr,int index1,int index2){
            int temp=arr[index1];
            arr[index1]=arr[index2];
            arr[index2]=temp;
        }

}
