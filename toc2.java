import java.util.Scanner;

public class toc2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = sc.nextLine();

        int state = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            switch (state) {

                case 0:
                    if (ch == 'a')
                        state = 1;
                    else if (ch == 'b')
                        state = 2;
                    else {
                        System.out.println("Invalid Input");
                        return;
                    }
                    break;

                case 1:
                    if (ch == 'a')
                        state = 0;
                    else if (ch == 'b')
                        state = 3;
                    else {
                        System.out.println("Invalid Input");
                        return;
                    }
                    break;

                case 2:
                    if (ch == 'a')
                        state = 3;
                    else if (ch == 'b')
                        state = 0;
                    else {
                        System.out.println("Invalid Input");
                        return;
                    }
                    break;

                case 3:
                    if (ch == 'a')
                        state = 2;
                    else if (ch == 'b')
                        state = 1;
                    else {
                        System.out.println("Invalid Input");
                        return;
                    }
                    break;
            }
        }

        if (state == 2)
            System.out.println("String Accepted");
        else
            System.out.println("String Rejected");

        sc.close();
    }
}
