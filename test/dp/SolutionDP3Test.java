package dp;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionDP3Test {

    @Test
    public void maxSubArray() {
        int[] data = {8,-19,5,-4,20};
        int[] data1 = {-2, -1};
        int[] data2 = {-2,1,-3,4,-1,2,1,-5,4};
        int[] data3 = {2,0,3,-2};
        int[] data4 = {-1,0};
        int[] data5 = {0,-1,3,1,-3,2,1,1};
        int[] data6 = {0,3,-1};
        int[] data7 = {-9,-2,1,8,7,-6,4,9,-9,-5,0,5,-2,5,9,7};
        SolutionDP3 solutionDP3 = new SolutionDP3();
        Assert.assertEquals(21, solutionDP3.maxSubArray(data));
        Assert.assertEquals(-1, solutionDP3.maxSubArray(data1));
        Assert.assertEquals(6, solutionDP3.maxSubArray(data2));
        Assert.assertEquals(5, solutionDP3.maxSubArray(data3));
        Assert.assertEquals(0, solutionDP3.maxSubArray(data4));
        Assert.assertEquals(5, solutionDP3.maxSubArray(data5));
        Assert.assertEquals(3, solutionDP3.maxSubArray(data6));
        Assert.assertEquals(33, solutionDP3.maxSubArray(data7));
    }
}