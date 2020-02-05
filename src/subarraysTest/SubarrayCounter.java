package subarraysTest;

public class SubarrayCounter {
    public static int countNegativeSubarrays(int[] array) {
        int count = 0, begin = 0, end, sum;
        while (begin < array.length) {
            //sum = array[begin];
            sum = 0;
            end = begin + 1;
            while (end <= array.length) {
                sum += array[end - 1];
                if (sum < 0) {
                    count++;
                }
                end++;
            }
            begin++;
        }
        return count;
    }
}
