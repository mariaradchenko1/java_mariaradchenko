public class hw9 {
    public static void evenBeforeOdd(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            if (array[left] % 2 != 0 && array[right] % 2 == 0) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            } else {
                if (array[left] % 2 == 0) {
                    left++;
                }
                if (array[right] % 2 != 0) {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 11, 9, 10, 4, 7, 3};
        System.out.println("Початковий масив: " + java.util.Arrays.toString(arr));

        evenBeforeOdd(arr);
        System.out.println("Масив після перевпорядкування: " + java.util.Arrays.toString(arr));
    }
}
