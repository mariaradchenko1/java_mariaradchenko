public class Mm {
    public static void main(String[] args) {
        int[] nums = {74, 85, 85, 85, 101, 85, 56};
        System.out.println(lastIndexOf(nums, 56));
    }
    public static int lastIndexOf(int numbers[], int k) {
        int idx = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (k == numbers[i]) return i;
        }
        return idx;
    }
}
