package Lab2_6;


public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(3.0);

        System.out.println("Окружность 1:");
        System.out.println("Радиус: " + circle1.getRadius());
        System.out.println("Площадь: " + circle1.calculateArea());
        System.out.println("Длина окружности: " + circle1.calculateCircumference());

        System.out.println("\nОкружность 2:");
        System.out.println("Радиус: " + circle2.getRadius());
        System.out.println("Площадь: " + circle2.calculateArea());
        System.out.println("Длина окружности: " + circle2.calculateCircumference());

        if (circle1.equals(circle2)) {
            System.out.println("\nОкружности равны по радиусу.");
        } else {
            System.out.println("\nОкружности различаются по радиусу.");
        }
    }
}
