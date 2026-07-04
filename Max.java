package smenomer;

public class Max {
    public static void main(String[] args) {
        int[] arr= {11,22,33,44,55,66,77,88};
        System.out.println(max(arr));

        System.out.println(maxRange(arr,0,8));
    }

    static int maxRange(int[] arr,int index1,int index2){
        int big=arr[index1];
        for (int i = index1+1; i < index2; i++) {
            if(arr[i]>big)
                big=arr[i];

        }return big;}

    static int max(int[] arr){
        int big=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>big)
                big=arr[i];

        }return big;
    }
}
