package dp;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionDP2Test {

    @Test
    public void maxProfit() {
        int[] data = {2,1,2,1,0,1,2};
        SolutionDP2 solutionDP2 = new SolutionDP2();
        solutionDP2.maxProfit(data);
    }
}