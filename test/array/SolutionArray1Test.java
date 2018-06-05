package array;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by Administrator on 2018/6/5.
 */
public class SolutionArray1Test {

    @Test
    public void removeDuplicates() throws Exception {
        int[] data1 = {7,7,1,5,3,6,4};
        SolutionArray1 solutionArray1 = new SolutionArray1();
        Assert.assertEquals(solutionArray1.removeDuplicates(data1), data1.length-1);
    }

}