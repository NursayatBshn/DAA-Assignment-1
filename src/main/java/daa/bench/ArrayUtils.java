package daa.bench;

import java.util.Random;

public class ArrayUtils {

    public static int[] generate(InputType type, int n, Random rnd) {
        int[] arr = new int[n];
        switch (type) {
            case RANDOM -> {
                for (int i = 0; i < n; i++) {
                    arr[i] = rnd.nextInt();
                }
            }
            case SORTED -> {
                for (int i = 0; i < n; i++) {
                    arr[i] = i;
                }
            }
            case DUPLICATES -> {
                // Random values strictly between 0 and 9
                for (int i = 0; i < n; i++) {
                    arr[i] = rnd.nextInt(10);
                }
            }
        }
        return arr;
    }
}
