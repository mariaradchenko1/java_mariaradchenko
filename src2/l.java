import java.util.Scanner;

public class l {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть сторону a: ");
        double a = scanner.nextDouble();
        System.out.print("Введіть сторону b: ");
        double b = scanner.nextDouble();
        System.out.print("Введіть сторону c: ");
        double c = scanner.nextDouble();
        if (isTriangle(a, b, c)) {
            System.out.println("Трикутник існує");
        } else {
            System.out.println("Такого трикутника не існує");
        }

        scanner.close();
    }
public static boolean isTriangle(double a, double b, double c) {
        return a + b > c && a + c > b && b + c > a;
    }
}
