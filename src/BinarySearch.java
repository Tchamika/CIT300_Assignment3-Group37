import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) return mid;
            else if (arr[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        double[] times = new double[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int[] arr = ArrayUtil.generateRandomArray(sizes[i]);
            Arrays.sort(arr);
            int target = arr[sizes[i] / 2];

            long start = System.nanoTime();
            binarySearch(arr, target);
            long end = System.nanoTime();

            times[i] = (end - start) / 1_000_000.0;
        }

        ArrayUtil.printTable("Binary Search", sizes, times);
    }
}
