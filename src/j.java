import java.util.Scanner;

public class j {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть рік: ");
        int year = scanner.nextInt();

        if (pp(year)) {
            System.out.println(year + " є високосним роком.");
        } else {
            System.out.println(year + " не є високосним роком.");
        }

        scanner.close();
    }
    public static boolean pp(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}