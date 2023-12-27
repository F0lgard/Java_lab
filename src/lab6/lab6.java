package lab6;

import javax.swing.*;
import java.awt.*;

public class lab6 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Task1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        frame.setContentPane(new JPanel() {
            @Override
            public Insets getInsets() {
                return new Insets(20, 20, 20, 20); // Встановлюємо відступи (зверху, зліва, знизу, справа)
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2, -150, 5));

        JLabel login = new JLabel("Логін:");
        JTextField textlogin = new JTextField(20);

        JLabel password = new JLabel("Пароль:");
        JTextField textpassword = new JTextField(20);

        inputPanel.add(login);
        inputPanel.add(textlogin);
        inputPanel.add(password);
        inputPanel.add(textpassword);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER));

        JButton okButton = new JButton("Ок");
        JButton cancelButton = new JButton("Відміна");

        buttonPanel.add(okButton);
        buttonPanel.add(cancelButton);

        frame.setLayout(new BorderLayout());
        frame.add(inputPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.pack();
        frame.setVisible(true);
    }
}
