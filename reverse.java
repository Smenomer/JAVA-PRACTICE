package smenomer;
import java.util.Scanner;
public class reverse {
    public static void main(String[] args) {
        int mult=0;
        int rev=0;
        int i=1;
        int rem=0;
        System.out.println("Enter the number to reverse");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int length = String.valueOf(n).length();
        for(int k=0;k<length;k++ ) {
            rem = n % 10;
            rev = (rev * 10)+rem;
            n=n/10;
        }
        System.out.println("reverse:"+rev);
    }
}
