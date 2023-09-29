package Lab2_3;


class Circle {
    private Point center;
    private double radius;

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public double getRadius() {
        return radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
}
