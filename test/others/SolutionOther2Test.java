package others;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionOther2Test {

    @Test
    public void hammingDistance() {
        SolutionOther2 solutionOther2 = new SolutionOther2();
        Assert.assertEquals(1, solutionOther2.hammingDistance(2, 3));
        Assert.assertEquals(2, solutionOther2.hammingDistance(1, 4));
    }
}