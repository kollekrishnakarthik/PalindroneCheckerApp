import java.util.Scanner;

class PalindroneChecker {

    public boolean checkPalindrone(String str) {

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = sc.nextLine();

        PalindroneChecker checker = new PalindroneChecker();

        if (checker.checkPalindrone(input))
            System.out.println("Palindrone");
        else
            System.out.println("Not Palindrone");

        sc.close();
    }
}