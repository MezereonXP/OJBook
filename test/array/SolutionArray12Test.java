package array;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class SolutionArray12Test {

    @Test
    public void threeSum() {
        int[] testcase1 = {-1, 0, 1, 2, -1, -4};
        SolutionArray12 solutionArray12 = new SolutionArray12();
        Assert.assertEquals(solutionArray12.threeSum(testcase1).size(), 2);
    }
}