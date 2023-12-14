import java.util.Arrays;

public class hw4 {
    public static int[] reversePartialArray(int[] array, int n) {
        if (n < 0 || n > array.length) {
            return null;
        }

        int[] result = Arrays.copyOf(array, array.length);

        for (int i = 0; i < n / 2; i++) {
            int temp = result[i];
            result[i] = result[n - 1 - i];
            result[n - 1 - i] = temp;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7};
        int n = 4;

        int[] reversedArray = reversePartialArray(originalArray, n);

        if (reversedArray != null) {
            System.out.println("Початковий масив: " + Arrays.toString(originalArray));
            System.out.println("n = " + n);
            System.out.println("Модифікований масив: " + Arrays.toString(reversedArray));
        } else {
            System.out.println("n має недопустиме значення.");
        }
    }
}

