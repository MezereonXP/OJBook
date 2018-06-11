package string;

import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionString2Test {

    @Test
    public void reverse() {
        SolutionString2 solutionString2 = new SolutionString2();
        Assert.assertEquals(321, solutionString2.reverse(123));
    }
}