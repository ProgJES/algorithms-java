package easy;

import java.util.Arrays;

/*
No-Zero integer is a positive integer that does not contain any 0 in its decimal representation.

Given an integer n, return a list of two integers [a, b] where:

a and b are No-Zero integers.
a + b = n
The test cases are generated so that there is at least one valid solution. If there are many valid solutions, you can return any of them.



Example 1:

Input: n = 2
Output: [1,1]
Explanation: Let a = 1 and b = 1.
Both a and b are no-zero integers, and a + b = 2 = n.
Example 2:

Input: n = 11
Output: [2,9]
Explanation: Let a = 2 and b = 9.
Both a and b are no-zero integers, and a + b = 11 = n.
Note that there are other valid answers as [8, 3] that can be accepted.
* */
public class GetNoZeroIntegers {
    public static void main(String[] args) {
        int[] noZeroIntegers = getNoZeroIntegers(111);
        System.out.println("noZeroIntegers = " + Arrays.toString(noZeroIntegers));
    }
    public static int[] getNoZeroIntegers(int n) {
        for (int fromStart = 1; fromStart < n; fromStart++) {
            int fromEnd = n - fromStart;
            if (fromEnd > 0 && !containsZero(fromStart) && !containsZero(fromEnd)) {
                return new int[]{fromStart, fromEnd};
            }
        }
        return new int[]{-1, -1};
    }

    public static boolean containsZero(int n) {
        while (n > 0) {
            if (n % 10 == 0) return true;
            n /= 10;
        }
        return false;
    }
}
