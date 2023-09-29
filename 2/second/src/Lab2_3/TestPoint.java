package Lab2_3;


public class TestPoint {
    public static void main(String[] args) {

        Point center1 = new Point(1.0, 2.0);


        Circle circle1 = new Circle(center1, 3.0);


        Tester tester = new Tester(3);


        tester.addCircle(circle1);


        tester.displayCircles();
    }
}
