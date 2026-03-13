import java.util.Scanner;

public class PalindroneCheckerApp {

    static class PalindromeChecker {

        public boolean checkPalindrome(String input) {

            if (input == null) {
                return false;
            }

            String str = input.replaceAll("\\s+", "").toLowerCase();

            return isPalindrome(str, 0, str.length() - 1);
        }

        private boolean isPalindrome(String str, int start, int end) {

            if (start >= end) {
                return true;
            }

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            return isPalindrome(str, start + 1, end - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string \"" + input + "\" is a Palindrome (ignoring case and spaces).");
        } else {
            System.out.println("The given string \"" + input + "\" is NOT a Palindrome (ignoring case and spaces).");
        }

        sc.close();
    }
}