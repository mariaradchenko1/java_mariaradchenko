import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть температуру в градусах Цельсія: ");
        double celsius = scanner.nextDouble();

        double fahrengeit = (celsius * 9/5) + 32;

        System.out.println("Температура в градусах Фаренгейта: " + fahrengeit);

        scanner.close();
    }
}
