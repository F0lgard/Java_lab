package lab5;

import javax.swing.*;
import java.awt.*;

public class lab5_2 {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Task2 Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 70);
        frame.setLayout(new FlowLayout());

        int result1 = 10;
        double result2 = 20.3;
        String result3 = "Hello developers";

        JLabel label1 = new JLabel("Result 1: " + result1);
        JLabel label2 = new JLabel("Result 2: " + result2);
        JLabel label3 = new JLabel("Result 3: " + result3);

        frame.add(label1);
        frame.add(label2);
        frame.add(label3);

        frame.setVisible(true);
    }
}
