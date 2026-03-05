import java.util.Scanner;

public class PalindroneCheckerApp {

    public static boolean isPalindrone(String str, int start, int end) {

        if (start >= end) {
            return true;
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        return isPalindrone(str, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean result = isPalindrone(normalized, 0, normalized.length() - 1);

        if (result) {
            System.out.println("The given string \"" + input + "\" is a Palindrone (ignoring case and spaces).");
        } else {
            System.out.println("The given string \"" + input + "\" is NOT a Palindrone (ignoring case and spaces).");
        }

        sc.close();
    }
}