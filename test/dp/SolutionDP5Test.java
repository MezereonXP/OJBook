package dp;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionDP5Test {

    int[] data = {1, 2, 3};

    @Test
    public void canJump() {
        SolutionDP5 solutionDP5 = new SolutionDP5();
        solutionDP5.canJump3(data);
    }
}