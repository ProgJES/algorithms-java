package medium;

public class ReverseInteger {
    public int reverse(int x) {
        //-2,147,483,648 to +2,147,483,647.
        int result = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            if (result > Integer.MAX_VALUE / 10) return 0;
            if (result < Integer.MIN_VALUE / 10) return 0;

            result = result * 10 + digit;
        }
        return result;
    }
}
