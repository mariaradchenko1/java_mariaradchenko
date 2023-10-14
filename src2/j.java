import java.util.Scanner;
public class j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double number2 = scanner.nextDouble();
        System.out.print("Введіть третє число: ");
        double number3 = scanner.nextDouble();

        double[] numbers = {number1, number2, number3};
        java.util.Arrays.sort(numbers);

        System.out.println("Числа у порядку зменшення: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);

        scanner.close();
    }
}