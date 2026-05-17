import java.util.Scanner;
import java.util.Stack;

public class toc3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        int i = 0;
        int n = input.length();

        while (i < n && input.charAt(i) == 'a') {
            stack.push('a');
            i++;
        }

        if (stack.isEmpty()) {
            System.out.println("Rejected");
            return;
        }

        while (i < n && input.charAt(i) == 'b') {

            if (stack.isEmpty()) {
                System.out.println("Rejected");
                return;
            }

            stack.pop();
            i++;
        }

        if (i == n && stack.isEmpty()) {
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }

        sc.close();
    }
}
