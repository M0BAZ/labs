package lab3_2;

import java.util.Arrays;


public class Tester {
    private Circle[] circles;
    private int count;

    public Tester(int capacity) {
        circles = new Circle[capacity];
        count = 0;
    }

    public void addCircle(Circle circle) {
        if (count < circles.length) {
            circles[count] = circle;
            count++;
        } else {
            System.out.println("Массив окружностей заполнен. Нельзя добавить больше.");
        }
    }

    public Circle findSmallestCircle() {
        if (count == 0) {
            return null;
        }

        Circle smallestCircle = circles[0];

        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() < smallestCircle.getRadius()) {
                smallestCircle = circles[i];
            }
        }

        return smallestCircle;
    }

    public Circle findLargestCircle() {
        if (count == 0) {
            return null;
        }

        Circle largestCircle = circles[0];

        for (int i = 1; i < count; i++) {
            if (circles[i].getRadius() > largestCircle.getRadius()) {
                largestCircle = circles[i];
            }
        }

        return largestCircle;
    }

    public void orderCirclesByRadius() {
        Arrays.sort(circles, 0, count, (c1, c2) -> Double.compare(c1.getRadius(), c2.getRadius()));
    }

    public void displayCircles() {
        System.out.println("Список окружностей:");
        for (int i = 0; i < count; i++) {
            System.out.println(circles[i]);
        }
    }
}
