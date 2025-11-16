public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] sizes = {100, 500, 1000};
        double[] times = new double[sizes.length];

        for (int i = 0; i < sizes.length; i++) {
            int[] arr = ArrayUtil.generateRandomArray(sizes[i]);

            long start = System.nanoTime();
            bubbleSort(arr);
            long end = System.nanoTime();

            times[i] = (end - start) / 1_000_000.0;
        }

        ArrayUtil.printTable("Bubble Sort", sizes, times);
    }
}
