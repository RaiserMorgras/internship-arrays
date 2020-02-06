package subarraysTest;

public class SubarrayCounter {
    public static int countNegativeSubarrays(int[] array) {
        int count = 0;
        int sum;
        for (int begin = 0; begin < array.length; begin++) {
            sum = 0;
            for (int end = begin + 1; end <= array.length; end++) {
                sum += array[end - 1];
                if (sum < 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
