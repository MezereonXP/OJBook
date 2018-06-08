package dp;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionDP3Test {

    @Test
    public void maxSubArray() {
        int[] data = {-2,1,-3,4,-1,2,1,-5,4};
        SolutionDP3 solutionDP3 = new SolutionDP3();
        solutionDP3.maxSubArray(data);
    }
}