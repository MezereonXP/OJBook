package math;

import java.math.BigInteger;

public class SolutionMath5 {

    public static void main(String[] args) {
        System.out.printf(""+trailingZeros2(1001171717));
    }

    public static long trailingZeros(long n) {
        // write your code here, try to do it without arithmetic operators.
        long count2 = 0;
        long count5 = 0;
        for (long i = 2; i < n; i++) {
            long temp = i;
            while (temp%2 == 0) {
                count2++;
                temp /=2;
            }
            while (temp%5 == 0) {
                count5++;
                temp /= 5;
            }
        }
        return Math.min(count2, count5);
    }

    public static long trailingZeros2(long n) {
        // write your code here, try to do it without arithmetic operators.
        long count5 = 0;
        long [] note = new long[(int) (n+1)];
        if (n < 5) {
            return 0;
        }
        note[5] = 1;
        for (long i = 2; i <= n; i++) {
            for (long j = 1; j <= i; j++) {
                if (i*j<=n) {
                    note[(int) (i*j)] = note[(int) i]+note[(int) j];
                }
            }
        }
        for (long i = 2; i <= n; i++) {
            count5 += note[(int) i];
        }
        return count5;
    }
}
