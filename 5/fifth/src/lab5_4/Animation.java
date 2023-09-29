package lab5_4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JFrame {
    private JLabel animationLabel;
    private Timer timer;
    private int currentFrame = 0;

    public Animation() {
        setTitle("Анимация");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        animationLabel = new JLabel();
        add(animationLabel, BorderLayout.CENTER);

        // Загрузите все кадры анимации (изображения) и сохраните их в массиве
        ImageIcon[] frames = new ImageIcon[4];
        for (int i = 0; i < 4; i++) {
            frames[i] = new ImageIcon("C:\\Users\\User\\Desktop\\study\\3 semestr\\vvedenie v alg\\5\\fifth\\src\\pic\\" + "frame" + i + ".png"); // Замените на свои файлы изображений
        }

        timer = new Timer(100, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Отображение текущего кадра и переход к следующему
                animationLabel.setIcon(frames[currentFrame]);
                currentFrame = (currentFrame + 1) % frames.length;
            }
        });

        timer.start(); // Запуск таймера для анимации
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Animation().setVisible(true);
            }
        });
    }
}

