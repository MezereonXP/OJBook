package others;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionOther1Test {

    @Test
    public void hammingWeight() {
        SolutionOther1 solutionOther1 = new SolutionOther1();
        Assert.assertEquals(0, solutionOther1.hammingWeight(0));
        Assert.assertEquals(1, solutionOther1.hammingWeight(1));
        Assert.assertEquals(1, solutionOther1.hammingWeight(2));
        Assert.assertEquals(2, solutionOther1.hammingWeight(3));
        Assert.assertEquals(1, solutionOther1.hammingWeight(-2147483648));
    }
}