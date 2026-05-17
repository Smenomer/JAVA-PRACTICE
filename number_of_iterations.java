package smenomer;
import java.util.Scanner;
public class number_of_iterations {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number in string");
        long s=in.nextLong();
        System.out.println("Enter the number you want find the iterations of:");
        int num=in.nextInt();
    int count=0;
       int size=String.valueOf(s).length();
        for (int i = 0; i < size; i++) {
            long rem=s%10;
            if(rem==num){
                count++;
            }s/=10;
        }
        System.out.println("Number of iteration of "+num+" is "+count);
    }
}
