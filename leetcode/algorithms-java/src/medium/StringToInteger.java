package medium;

public class StringToInteger {
    public int myAtoi(String s) {
        if (s == null) return 0;
        int n = s.length();
        int i = 0;

        // Skip whitespace
        while (i < n && s.charAt(i) == ' ') i++;
        if (i == n) return 0;

        // Sign
        int sign = 1; // default positive
        char ch = s.charAt(i);
        if (ch == '+' || ch == '-') {
            sign = (ch == '-' ? -1 : 1);
            i++;
        }

        // Digit accumulate with overflow check
        int result = 0;
        while (i < n) {
            char c = s.charAt(i);
            if (c < '0' || c > '9') break;
            int digit = c - '0';

            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result * sign;
    }
}
