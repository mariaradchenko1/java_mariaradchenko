import java.util.Scanner;

public class p{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int q = 0;
        int number;
        System.out.println("Введіть числа. Введіть -1 для припинення вводу.");
        while (true) {
            System.out.print("Введіть число: ");
            number = scanner.nextInt();

            if (number == -1) {
                break;
            }
            q += number;
        }
        System.out.println("Сума введених чисел (включаючи -1): " + q);
        scanner.close();
    }
}
