package smenomer;
import java.util.Arrays;
public class ReversingArray {
    public static void main(String[] Args){
        int[] arr={1,2,3,4,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
  static void reverse(int[] arr) {
      int start = 0;
      int end = arr.length - 1;

      while (start <= end) {
          int temp = arr[start];
          arr[start] = arr[end];
          arr[end] = temp;
          start++;
          end--;
      }

  }
}
