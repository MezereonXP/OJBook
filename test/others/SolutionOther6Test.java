package others;

import static org.junit.Assert.*;
import org.junit.Test;

public class SolutionOther6Test {

    @Test
    public void missingNumber() {
        int[] data = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        SolutionOther6 solutionOther6 = new SolutionOther6();
        solutionOther6.missingNumber(data);
    }
}