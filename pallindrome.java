package smenomer;

public class pallindrome {
    public static boolean isPalindrome(int x) {

        int rev = 0;
        int rem = 0;
        int original = x;

        while (x > 0) {
            rem = x % 10;
            x = x / 10;
            rev = (rev * 10) + rem;
        }

        return rev == original;
    }

    public static void main(String[] args) {

        int num = 121;

        if (isPalindrome(num)) {
            System.out.println(num + " is a Palindrome");
        } else {
            System.out.println(num + " is not a Palindrome");
        }
    }
}
