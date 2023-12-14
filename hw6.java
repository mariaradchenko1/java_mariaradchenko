import java.util.Arrays;

public class hw6 {
    public static int[] allIndexesOf(int[] numbers, int k) {
        int count = 0;
        for (int number : numbers) {
            if (number == k) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        int[] indexes = new int[count];
        int currentIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                indexes[currentIndex] = i;
                currentIndex++;
            }
        }

        return indexes;
    }

    public static void main(String[] args) {
        int[] numbers = {74, 85, 85, 85, 101, 85, 56};
        int k = 85;

        int[] allIndexes = allIndexesOf(numbers, k);

        if (allIndexes != null) {
            System.out.println("Індекси числа " + k + " в масиві: " + Arrays.toString(allIndexes));
        } else {
            System.out.println("Число " + k + " не зустрічається в масиві.");
        }
    }
}
