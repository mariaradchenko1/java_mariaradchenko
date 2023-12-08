import java.util.Scanner;
public class masiv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число днів: ");
        int days = scanner.nextInt();
        int[] num = new int[days];
        for (int a = 0; a < days; a++) {
            num[a] = scanner.nextInt();

        }
    }
}
