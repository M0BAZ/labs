package lab3_2;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Tester tester = new Tester(5);

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            Point center = new Point(random.nextDouble(), random.nextDouble());
            double radius = random.nextDouble() * 10; // случайный радиус от 0 до 10
            Circle circle = new Circle(center, radius);
            tester.addCircle(circle);
        }

        tester.displayCircles();

        Circle smallestCircle = tester.findSmallestCircle();
        if (smallestCircle != null) {
            System.out.println("\nСамая маленькая окружность: " + smallestCircle);
        } else {
            System.out.println("\nНет окружностей.");
        }

        Circle largestCircle = tester.findLargestCircle();
        if (largestCircle != null) {
            System.out.println("Самая большая окружность: " + largestCircle);
        } else {
            System.out.println("Нет окружностей.");
        }

        tester.orderCirclesByRadius();
        System.out.println("\nСписок окружностей после сортировки по радиусу:");
        tester.displayCircles();
    }
}
