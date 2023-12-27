package lab11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class lab11 extends JFrame {
    private JTextField parameterATextField, stepTextField, pointsTextField;
    private JTextArea resultTextArea;

    public lab11() {
        super("Calculator");

        // Set the layout for the frame
        setLayout(new BorderLayout());

        // Create components
        JLabel functionLabel = new JLabel("Функція: Y=A*sqrt(X)*Sin(A*X)", SwingConstants.CENTER);
        JLabel inputDataLabel = new JLabel("Вхідні дані", SwingConstants.LEFT);
        JLabel parameterALabel = new JLabel("Параметр A: ");
        JLabel stepLabel = new JLabel("Крок(h): ");
        JLabel pointsLabel = new JLabel("Кількість точок: ");

        parameterATextField = new JTextField(10);
        stepTextField = new JTextField(10);
        pointsTextField = new JTextField(10);
        resultTextArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(resultTextArea);

        // Create panels for organizing components
        JPanel topPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(4, 2, 5, 5));
        JPanel outputPanel = new JPanel(new BorderLayout());

        // Add components to the input panel
        inputPanel.add(inputDataLabel);
        inputPanel.add(new JLabel(""));
        inputPanel.add(parameterALabel);
        inputPanel.add(parameterATextField);
        inputPanel.add(stepLabel);
        inputPanel.add(stepTextField);
        inputPanel.add(pointsLabel);
        inputPanel.add(pointsTextField);

        // Add components to the top panel
        topPanel.add(functionLabel, BorderLayout.CENTER);

        // Add components to the output panel
        outputPanel.add(scrollPane, BorderLayout.CENTER);

        // Add panels to the main frame
        add(topPanel, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(outputPanel, BorderLayout.SOUTH);

        // Set behavior on window close
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        pointsTextField.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the input values
                double parameterA = Double.parseDouble(parameterATextField.getText());
                double step = Double.parseDouble(stepTextField.getText());
                int numPoints = Integer.parseInt(pointsTextField.getText());

                // Clear previous results
                resultTextArea.setText("");

                // Calculate and append the values to the resultTextArea
                for (int i = 0; i < numPoints; i++) {
                    double x = i * step;
                    double y = parameterA * Math.sqrt(x) * Math.sin(parameterA * x);
                    resultTextArea.append("x = " + x + ", y = " + y + "\n");
                }
            }
        });
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new lab11());
    }
}