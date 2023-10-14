import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть час у хвилинах: ");
        double timeInMinutes = scanner.nextDouble();

        double cycleTime = 6.0;
        double elapsedTime = timeInMinutes % cycleTime;

        if (elapsedTime < 3.0) {
            System.out.println("Зелений сигнал для пішоходів.");
        } else if (elapsedTime < 4.0) {
            System.out.println("Жовтий сигнал для пішоходів.");
        } else {
            System.out.println("Червоний сигнал для пішоходів.");
        }

        scanner.close();
    }
}
