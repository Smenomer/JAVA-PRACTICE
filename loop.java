package sujay;

//public class loop {
//    public static void main(String[] args) {
//        int x=8;
//        int y=10;
//        if(x<5 && y==10) {
//            System.out.println("Hello");
//        }
//     else if(x==8 && y==10){
//                System.out.println("hi");
//            }
//    }
//}

import java.util.Scanner;
public class loop{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x>5)
            System.out.println("x greater than 5");
        else System.out.println("x less than 5");
    }
}