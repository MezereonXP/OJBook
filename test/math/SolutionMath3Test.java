package math;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionMath3Test {

    @Test
    public void isPowerOfThree() {
        SolutionMath3 solutionMath3 = new SolutionMath3();
        solutionMath3.isPowerOfThree(27);
    }

    @Test
    public void isPowerOfTwo() {
        SolutionMath3 solutionMath3 = new SolutionMath3();
        Assert.assertEquals(solutionMath3.isPowerOfTwo(2), true);
        Assert.assertEquals(solutionMath3.isPowerOfTwo(4), true);
        Assert.assertEquals(solutionMath3.isPowerOfTwo(8), true);
        Assert.assertEquals(solutionMath3.isPowerOfTwo(6), false);
    }
}