public class Four {
    public static void main(String[] args) {
        String validPalindrome = "MALAYALAM";
        String inValidPalindrome = "Ashith";

        boolean isValid = isPalindrome(validPalindrome);
        if (isValid)
            System.out.println("The given string is a palindrome");
        else
            System.out.println("The given string is not a palindrome");
    }

    private static boolean isPalindrome(String str) {
        str = str.toUpperCase();
        int halfSize;
        int lastCharPosition = str.length() - 1;
        if (str.length() % 2 == 0) {
            halfSize = str.length() / 2;
        } else {
            halfSize = (str.length() - 1) / 2;
        }
        for (int i = 0; i < halfSize; i++) {
            if (str.charAt(i) != str.charAt(lastCharPosition - i)) {
                return false;
            }
        }
        return true;
    }
}
