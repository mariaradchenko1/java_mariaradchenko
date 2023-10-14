import java.util.Scanner;

public class i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int number1 = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int number2 = scanner.nextInt();
        System.out.print("Введіть третє число: ");
        int number3 = scanner.nextInt();
        System.out.print("Введіть третє число: ");
        int number4 = scanner.nextInt();

        int min = Math.min(number1, Math.min(number2, Math.min(number3, number4)));

        System.out.println("Найменше число: " + min);

        scanner.close();
    }
}
