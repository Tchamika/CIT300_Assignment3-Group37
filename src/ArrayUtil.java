import java.util.Random;
import java.util.Arrays;

public class ArrayUtil {

    // Generate random integer array of given size
    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        Random rand = new Random(123); for reproducibility
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(1000); // numbers from 0 to 999
        }
        return arr;
    }

    // Print results in table format
    public static void printTable(String algorithm, int[] sizes, double[] times) {
        System.out.println("Algorithm: " + algorithm);
        System.out.println("Input Size | Time (ms)");
        System.out.println("----------------------");
        for (int i = 0; i < sizes.length; i++) {
            System.out.printf("%d\t | %.4f\n", sizes[i], times[i]);
        }
        System.out.println();
    }
}
