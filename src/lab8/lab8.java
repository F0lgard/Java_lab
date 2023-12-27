import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.ArrayList;

public class lab8 extends JFrame {
    JTextField inputField = new JTextField(20);
    JTextField outputField = new JTextField(20);
    JLabel inputLabel = new JLabel("Введіть текст:");
    JLabel outputLabel = new JLabel("Виведений текст:");
    JButton executeButton = new JButton("Виконати");
    JButton printButton = new JButton("Друкувати");

    lab8() {
        super("Мітки та поля вводу/виводу");
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        setSize(400, 200);
        inputField.setPreferredSize(new Dimension(200, 25));
        outputField.setPreferredSize(new Dimension(200, 25));
        outputField.setEditable(false);
        JPanel inputPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.anchor = GridBagConstraints.WEST;
        gbc.gridx = 0;
        gbc.gridy = 0;
        inputPanel.add(inputLabel, gbc);
        gbc.gridy = 1;
        inputPanel.add(inputField, gbc);
        JPanel outputPanel = new JPanel(new GridBagLayout());
        gbc.gridx = 0;
        gbc.gridy = 0;
        outputPanel.add(outputLabel, gbc);
        gbc.gridy = 1;
        outputPanel.add(outputField, gbc);
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ArrayList<String> strings = new ArrayList<>();
        buttonPanel.add(executeButton);
        buttonPanel.add(printButton);
        executeButton.addActionListener(e -> {
            outputField.setText(inputField.getText());
            strings.add(inputField.getText());
        });
        inputField.addActionListener(e -> {
            outputField.setText(inputField.getText());
            strings.add(inputField.getText());
        });
        printButton.addActionListener(e -> System.out.println(strings));

        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        c.add(inputPanel, BorderLayout.NORTH);
        c.add(outputPanel, BorderLayout.CENTER);
        c.add(buttonPanel, BorderLayout.SOUTH);

        WindowListener wndCloser = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        addWindowListener(wndCloser);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new lab8().setVisible(true));
    }
}