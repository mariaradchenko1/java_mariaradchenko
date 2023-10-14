import java.util.Scanner;

public class с {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        double number1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double number2 = scanner.nextDouble();

        System.out.println("Ви ввели два числа: x =  " + number1 + "; y =  " + number2);

        scanner.close();
    }
}

