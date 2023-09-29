package lab5_2;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomShape extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    public static final int NUM_SHAPES = 20;

    public RandomShape() {
        setTitle("Случайные фигуры");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new ShapesPanel());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new RandomShape().setVisible(true);
            }
        });
    }
}

class ShapesPanel extends JPanel {
    private Random random = new Random();

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (int i = 0; i < RandomShape.NUM_SHAPES; i++) {
            int x = random.nextInt(getWidth());
            int y = random.nextInt(getHeight());
            int width = random.nextInt(100) + 50;
            int height = random.nextInt(100) + 50;
            Color color = getRandomColor();

            int shapeType = random.nextInt(3);
            switch (shapeType) {
                case 0:
                    g.setColor(color);
                    g.fillRect(x, y, width, height);
                    break;
                case 1:
                    g.setColor(color);
                    g.fillOval(x, y, width, height);
                    break;
                case 2:
                    g.setColor(color);
                    g.fillPolygon(getRandomPolygon(x, y, width, height));
                    break;
            }
        }
    }

    private Color getRandomColor() {
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        return new Color(r, g, b);
    }

    private Polygon getRandomPolygon(int x, int y, int width, int height) {
        int[] xPoints = {x, x + width, x + width / 2};
        int[] yPoints = {y + height, y + height, y};
        int numPoints = 3;
        return new Polygon(xPoints, yPoints, numPoints);
    }
}

