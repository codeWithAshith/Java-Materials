public class Three {
    public static void main(String[] args) {
        int startNumber = 1, endNumber = 100;
        for (int i = startNumber; i <= endNumber; i++) {
            if (checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    private static boolean checkPrime(int number) {
        // 0, 1 and negative numbers are not prime
        if (number < 2)
            return false;
        else {
            // no need to run loop till num-1 as for any number x the numbers in
            // the range(num/2 + 1, num) won't be divisible anyway.
            // Example 36 won't be divisible by anything b/w 19-35
            int x = number / 2;
            for (int i = 2; i < x; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        // the number would be prime if we reach here
        return true;
    }
}
