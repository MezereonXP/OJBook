package sort;

import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;

public class SortSolution1Test {

    @Test
    public void merge() {
        SortSolution1 sortSolution1 = new SortSolution1();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 4, 6};
        sortSolution1.merge(nums1, 3, nums2, 3);
        System.out.printf(Arrays.toString(nums1));
    }
}