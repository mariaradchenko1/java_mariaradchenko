import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();
        if (a > 0) {
            a = a * 2;
        }
        else if (a < 0) {
        a = a + 1;
        }
        System.out.println("Результат: " + a);

        scanner.close();
    }
}