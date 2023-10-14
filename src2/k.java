import java.util.Scanner;
public class k {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String first = scanner.nextLine();
        System.out.print("Введіть друге ім'я: ");
        String second = scanner.nextLine();

        if (first.equals(second)) {
            System.out.println("Імена ідентичні");
        } else if (first.length() == second.length()) {
            System.out.println("Довжини імен рівні");
        }

        scanner.close();
    }
}
