public class hw7 {
    public static boolean isSorted(double[] array) {
        if (array.length <= 1) {
            return true;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        double[] list1 = {16.1, 12.3, 22.2, 14.4};
        double[] list2 = {1.5, 4.3, 7.0, 19.5, 25.1, 46.2};

        boolean isList1Sorted = isSorted(list1);
        boolean isList2Sorted = isSorted(list2);

        System.out.println("Масив list1 відсортований: " + isList1Sorted);
        System.out.println("Масив list2 відсортований: " + isList2Sorted);
    }
}

