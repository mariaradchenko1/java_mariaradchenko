class Shape {
    public double getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Площа фігури (загальний метод): " + shape.getArea());

        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("Площа прямокутника: " + rectangle.getArea());
    }
}
