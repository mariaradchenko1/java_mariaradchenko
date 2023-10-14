import java.util.Scanner;
public class h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int number2 = scanner.nextInt();
        System.out.print("Введіть третє число: ");
        int number3 = scanner.nextInt();

        int max = Math.max(number1, Math.max(number2, number3));

        System.out.println("Найбільше число: " + max);

        scanner.close();
    }
}
