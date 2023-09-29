package lab5_3;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Picture extends JFrame {
    private JLabel imageLabel;

    public Picture(String imagePath) {
        setTitle("Отображение изображения");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        imageLabel = new JLabel();
        setImage(imagePath);

        add(imageLabel, BorderLayout.CENTER);
    }

    public void setImage(String imagePath) {
        try {
            BufferedImage img = ImageIO.read(new File(imagePath));
            ImageIcon icon = new ImageIcon(img);
            imageLabel.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Пожалуйста, укажите путь к изображению в аргументах командной строки.");
            return;
        }

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Picture(args[0]).setVisible(true);
            }
        });
    }
}

