package smenomer;
import javax.swing.*;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n1= sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2=sc.nextInt();
        System.out.println("Enter the operation to perform");
        char op=sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Sum of n1 and n2 are: "+n1+n2);
                break;

            case '-':
                System.out.println("Difference of n1 and n2 are: "+(n1-n2));
                break;

            case '*':
                System.out.println("Product of n1 and n2 are: "+n1*n2);
                break;
            case '/':
                System.out.println("Division of n1 and n2 are: "+n1/n2);
                break;
            default:
                System.out.println("Select a valid operation");
        }
    }
}
