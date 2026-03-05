import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== UC7: Deque-Based Optimized Palindrone Checker =====");
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        input = input.replaceAll("\\s+", "").toLowerCase();

        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrone = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrone = false;
                break;
            }
        }

        if (isPalindrone) {
            System.out.println("Result: The string is a Palindrone ");
        } else {
            System.out.println("Result: The string is NOT a Palindrone ");
        }

        scanner.close();
    }
}