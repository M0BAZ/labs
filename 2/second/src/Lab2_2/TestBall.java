package Lab2_2;


public class TestBall {
    public static void main(String[] args) {
        Ball basketball = new Ball(1.5, 5.7);

        basketball.setXY(1.4, 9.8);
        System.out.println(basketball.getX() + " " + basketball.getY());

        basketball.setX(4.3);
        basketball.setY(6.7);
        System.out.println(basketball.getX() + " " + basketball.getY());

        System.out.println(basketball);
    }
}

