package Lab2_6;

import java.lang.Math;

public class Circle {
    private double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус окружности должен быть положительным числом.");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Радиус окружности должен быть положительным числом.");
        }
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(Circle otherCircle) {
        return this.radius == otherCircle.radius;
    }
}
