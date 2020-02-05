package subarraysTest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCases {
    @Test
    public void testCase1() {
        int[] array = {0, 7, -1, -5, 2, -3, 17};
        int expected = 9;
        int actualResult = SubarrayCounter.countNegativeSubarrays(array);
        assertEquals(expected, actualResult);
    }

    @Test
    public void testCase2() {
        int[] array = {1, -2, 4, -5, 1};
        int expected = 9;
        int actualResult = SubarrayCounter.countNegativeSubarrays(array);
        assertEquals(expected, actualResult);
    }
}
