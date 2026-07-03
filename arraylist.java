package smenomer;
import java.util.Arrays;
import java.util.Scanner;
public class arraylist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int[] num=new int[5];
//        System.out.println("Enter the elements of the array");
//        for (int i = 0; i < num.length; i++) {
//            num[i]= sc.nextInt();
//        }
//        for (int i = 0; i < num.length; i++) {
//            System.out.print(num[i]+" ");
//        }

//        int[] n={2,3,4,5,6,7};
//        System.out.println(n[0]);
//        System.out.println(n.length);

//        int[] num=new int[8];
//        System.out.println("Enter the elements of the array");
//        for (int i = 0; i < num.length; i++) {
//            num[i]=sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(num));

//    String[] n=new String[5];
//        System.out.println("Enter the elements of the string");
//        for (int i = 0; i < n.length; i++) {
//            n[i]=sc.next();
//        }
//
//
//            System.out.println("Elements of the array are:");
//            System.out.println(Arrays.toString(n));
//
//
//        n[1]="Sujay";
//        System.out.print(Arrays.toString(n));

//        String[][] n=new String[3][3];
//        System.out.println("ENETER THE ELEMENTS OF 2D ARRAY: /n");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//
//            }
//
//        }
//        int[][] arr={
//                {1,2,3},
//                {3,4,5},
//                {5,6,7}
//        };
//        for(int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.println(arr[i][j]+"");
//            }
//            System.out.println();
//        }

        int[][] arra = new int[3][3];
        for (int i = 0; i < arra.length; i++) {
            for (int j = 0; j < arra[i].length; j++) {
                arra[i][j] = sc.nextInt();

            }

        }
        System.out.println("The array:");
        for (int i = 0; i < arra.length; i++) {
            for (int j = 0; j < arra[i].length; j++) {
                System.out.print(arra[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < arra.length; i++) {
            System.out.println(Arrays.toString(arra[i]));

        }
        for(int[] a:arra){
            System.out.println(Arrays.toString(a));
        }
    }
}