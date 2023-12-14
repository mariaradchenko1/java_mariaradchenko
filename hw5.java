public class hw5 {
    public static int lastIndexOf(int[] numbers, int k) {
        int lastIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == k) {
                lastIndex = i;
            }
        }

        return lastIndex;
    }

    public static void main(String[] args) {
        int[] numbers = {74, 85, 85, 85, 101, 85, 56};
        int k = 85;

        int lastIndex = lastIndexOf(numbers, k);

        if (lastIndex != -1) {
            System.out.println("Останній індекс числа " + k + " в масиві: " + lastIndex);
        } else {
            System.out.println("Число " + k + " не знайдено в масиві.");
        }
    }
}

