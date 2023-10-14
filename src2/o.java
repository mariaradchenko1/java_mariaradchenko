import java.util.Scanner;

public class o {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();

        System.out.print("Введіть рік народження: ");
        int year = scanner.nextInt();
        System.out.print("Введіть місяць народження: ");
        int month = scanner.nextInt();
        System.out.print("Введіть день народження: ");
        int day = scanner.nextInt();

        String birthdate = year + "." + month + "." + day + ".";
        System.out.println("Мене звуть " + name + ". Я народився " + birthdate);

        scanner.close();
    }
}
