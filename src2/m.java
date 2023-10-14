import java.util.Scanner;
public class m {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введіть друге число: ");
        int num2 = scanner.nextInt();
        System.out.print("Введіть третє число: ");
        int num3 = scanner.nextInt();

        if (num1 == num2 || num2 == num3 || num1 == num3) {
            System.out.print("Рівні числа: ");

            if (num1 == num2) {
                System.out.print(num1 + " і " + num2);
            }

            if (num2 == num3) {
                if (num1 == num2) {
                    System.out.print(" і ");
                }
                System.out.print(num2 + " і " + num3);
            }

            if (num1 == num3) {
                if (num1 == num2 || num2 == num3) {
                    System.out.print(" і ");
                }
                System.out.print(num1 + " і " + num3);
            }
        } else {
            System.out.println("Рівних чисел немає.");
        }

        scanner.close();
    }
}
