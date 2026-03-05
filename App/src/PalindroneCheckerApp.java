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
        String str = sc.nextLine();

        boolean result = isPalindrone(str, 0, str.length() - 1);

        if (result) {
            System.out.println("The given string \"" + str + "\" is a Palindrone.");
        } else {
            System.out.println("The given string \"" + str + "\" is NOT a Palindrone.");
        }

        sc.close();
    }
}