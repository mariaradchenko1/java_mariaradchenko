import java.util.Arrays;

public class nomer1 {
    public static int[] reverseArray(int[] array, int n) {
            if (n <= 0 || n > array.length) {
                return null;
            }
            int[] newArray = array.clone();

            for (int i = 0, j = n - 1; i < j; i++, j--) {
                int temp = newArray[i];
                newArray[i] = newArray[j];
                newArray[j] = temp;
            }

            return newArray;
        }

        public static void main(String[] args) {
            int[] originalArray = {1, 2, 3, 4, 5, 6};
            int n = 3;

            int[] result = reverseArray(originalArray, n);

            if (result != null) {
                System.out.println("Original Array: " + Arrays.toString(originalArray));
                System.out.println("Reversed Array up to index " + (n - 1) + ": " + Arrays.toString(result));
            } else {
                System.out.println("Invalid value of n. Cannot reverse the array.");
            }
        }
    }
