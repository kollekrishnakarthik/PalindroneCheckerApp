
    public class PalindroneCheckerApp {
        public static void main(String[] args) {
            String str = "level";

            // Convert string to character array
            char[] charArray = str.toCharArray();
            boolean isPalindrone = true;

            // Use two-pointer approach
            int start = 0;
            int end = charArray.length - 1;

            while (start < end) {
                if (charArray[start] != charArray[end]) {
                    isPalindrone = false;
                    break;
                }
                start++;
                end--;
            }

            // Display result
            if (isPalindrone) {
                System.out.println(str + " is a palindrone.");
            } else {
                System.out.println(str + " is not a palindrone.");
            }
        }
    }