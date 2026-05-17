package smenomer;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        for(int i=1;i<n;i++){
            int temp=b;
            b=a+b;
            a=temp;
        }
        System.out.println(b);
    }
}
