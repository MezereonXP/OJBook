package math;

import java.util.Arrays;

/**
 * @program: SolutionMath2
 * @description: Solution math 2 for leetcode
 * @author: mezereonxp Email: mezereonxp@gmail.com
 * @create: 2018/7/9
 **/
public class SolutionMath2 {

    // 埃拉托斯特尼筛法 Sieve of Eratosthenes
    public int countPrimes(int n) {
        int count = 0;
        boolean[] prime = new boolean[n];
        Arrays.fill(prime, true);
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                for (int j = i * 2; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }
        return count;
    }
}
