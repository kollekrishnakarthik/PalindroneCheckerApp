public class PalindroneCheckerApp {
    static void main() {
        String str = "madam";
        boolean isPalindrone = true;
        int start = 0;
        for (int i = str.length() - 1; i > 0; i--) {
            if (str.charAt(i) != str.charAt(start)) {
                isPalindrone = false;
                break;
            }
            start++;
        }
    }
}