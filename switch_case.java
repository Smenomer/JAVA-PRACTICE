package sujay;
import java.sql.SQLOutput;
import java.util.Scanner;
public class switch_case {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

        switch(n){
            case 1:
                System.out.println("number 1");
                break;
            case 2:
                System.out.println("number 2");
                break;
            case 3:
                System.out.println("number 3");
                break;
            case 4:
                System.out.println("number 4");
                break;
            case 5:
                System.out.println("number 5");
                break;
            case 6:
                System.out.println("number 6");
                break;
            default:
                System.out.println("Enter a valid input");
        }

    }
}
