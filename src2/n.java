import java.util.Scanner;
public class n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        double num1 = scanner.nextDouble();
        System.out.print("Введіть друге число: ");
        double num2 = scanner.nextDouble();
        System.out.print("Введіть третє число: ");
        double num3 = scanner.nextDouble();
        double average;
        if (num1 == num2 && num2 == num3) {
            average = num1;
        } else if ((num1 >= num2 && num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            average = num1;
        } else if ((num2 >= num1 && num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            average = num2;
        } else {
            average = num3;
        }
        System.out.println("Середнє число: " + average);
        scanner.close();
    }
}
