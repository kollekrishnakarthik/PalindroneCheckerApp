import java.util.Stack;

public class PalindroneCheckerStack {
    public static boolean isPalindrone(String input) {
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "racecar";
        System.out.println(test + " is palindrone? " + isPalindrone(test));
    }
}