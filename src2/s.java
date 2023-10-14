import java.util.Scanner;
public class s {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();
        for (int a = 0; a < 10; a++) {
            System.out.println(name + " любить мене!");
        }
        scanner.close();
    }
}