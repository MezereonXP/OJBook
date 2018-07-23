package dp;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionDP8Test {

    int[] data = {1, 3, 6, 7, 9, 4, 10, 5, 6};

    @Test
    public void lengthOfLIS() {
        SolutionDP8 solutionDP8 = new SolutionDP8();
        solutionDP8.lengthOfLIS(data);
    }
}