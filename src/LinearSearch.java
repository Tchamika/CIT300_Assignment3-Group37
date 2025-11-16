public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        double[] times = new double[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int[] arr = ArrayUtil.generateRandomArray(sizes[i]);
            int target = arr[sizes[i] / 2]; // pick middle element for search

            long start = System.nanoTime();
            linearSearch(arr, target);
            long end = System.nanoTime();

            times[i] = (end - start) / 1_000_000.0; // convert to ms
        }

        ArrayUtil.printTable("Linear Search", sizes, times);
    }
}
