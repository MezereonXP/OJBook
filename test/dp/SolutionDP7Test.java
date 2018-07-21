package dp;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionDP7Test {

    int[] coins = {3};

    @Test
    public void coinChange() {
        SolutionDP7 solutionDP7 = new SolutionDP7();
        System.out.printf(String.valueOf(solutionDP7.coinChange(coins, 2)));
    }
}