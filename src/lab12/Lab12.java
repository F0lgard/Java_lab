package Lab12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Lab12 extends JFrame {

    private int numberOfPoints = 0;
    private JFrame frame;
    private JPanel cardPanel;
    private CardLayout cardLayout;
    private int currentWindow = 1;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                new Lab12();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Lab12() {

        frame = new JFrame("Lab12");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        cardLayout = new CardLayout();
        cardPanel = new JPanel(cardLayout);

        createWindow1();
        createWindow2();
        createWindow3();
        createWindow4();

        cardPanel.add(window1, "window1");
        cardPanel.add(window2, "window2");
        cardPanel.add(window3, "window3");
        cardPanel.add(window4, "window4");

        frame.getContentPane().add(cardPanel);

        frame.setSize(300, 180);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private void createWindow1() {
        JPanel window1 = new JPanel(new BorderLayout());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.Y_AXIS));

        centerPanel.add(new JLabel("Питання №1"));
        centerPanel.add(new JLabel("Яка столиця України?"));

        JRadioButton firstARadioButton = new JRadioButton("Париж");
        JRadioButton firstBRadioButton = new JRadioButton("Вашингтон");
        JRadioButton firstCRadioButton = new JRadioButton("Київ");

        ButtonGroup group = new ButtonGroup();
        group.add(firstARadioButton);
        group.add(firstBRadioButton);
        group.add(firstCRadioButton);

        centerPanel.add(firstARadioButton);
        centerPanel.add(firstBRadioButton);
        centerPanel.add(firstCRadioButton);

        window1.add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        JButton switchButton1 = new JButton("Далі");
        switchButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (firstCRadioButton.isSelected()) {
                    numberOfPoints += 5;
                } else {
                    numberOfPoints += 2;
                }
                cardLayout.show(cardPanel, "window2");
            }
        });
        bottomPanel.add(switchButton1);

        window1.add(bottomPanel, BorderLayout.SOUTH);
    }

    private void createWindow2() {
        JPanel window2 = new JPanel(new BorderLayout());

        JPanel centerPanel2 = new JPanel();
        centerPanel2.setLayout(new BoxLayout(centerPanel2, BoxLayout.Y_AXIS));

        centerPanel2.add(new JLabel("Питання №2"));
        centerPanel2.add(new JLabel("Яка столиця Франції?"));

        JRadioButton secondARadioButton = new JRadioButton("Париж");
        JRadioButton secondBRadioButton = new JRadioButton("Київ");
        JRadioButton secondCRadioButton = new JRadioButton("Вашингтон");

        ButtonGroup secondGroup = new ButtonGroup();
        secondGroup.add(secondARadioButton);
        secondGroup.add(secondBRadioButton);
        secondGroup.add(secondCRadioButton);

        centerPanel2.add(secondARadioButton);
        centerPanel2.add(secondBRadioButton);
        centerPanel2.add(secondCRadioButton);

        window2.add(centerPanel2, BorderLayout.CENTER);

        JPanel bottomPanel2 = new JPanel();
        JButton switchButton2 = new JButton("Далі");
        switchButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (secondARadioButton.isSelected()) {
                    numberOfPoints += 5;
                } else {
                    numberOfPoints += 2;
                }
                cardLayout.show(cardPanel, "window3");
            }
        });
        bottomPanel2.add(switchButton2);

        window2.add(bottomPanel2, BorderLayout.SOUTH);

        // Add window2 to the class scope
        this.window2 = window2;
    }

    private void createWindow3() {
        window3 = new JPanel(new BorderLayout());

        JPanel centerPanel3 = new JPanel();
        centerPanel3.setLayout(new BoxLayout(centerPanel3, BoxLayout.Y_AXIS));

        centerPanel3.add(new JLabel("Питання №3"));
        centerPanel3.add(new JLabel("Яка столиця США?"));

        JRadioButton thirdARadioButton = new JRadioButton("Київ");
        JRadioButton thirdBRadioButton = new JRadioButton("Париж");
        JRadioButton thirdCRadioButton = new JRadioButton("Вашингтон");

        ButtonGroup thirdGroup = new ButtonGroup();
        thirdGroup.add(thirdARadioButton);
        thirdGroup.add(thirdBRadioButton);
        thirdGroup.add(thirdCRadioButton);

        centerPanel3.add(thirdARadioButton);
        centerPanel3.add(thirdBRadioButton);
        centerPanel3.add(thirdCRadioButton);

        window3.add(centerPanel3, BorderLayout.CENTER);

        JPanel bottomPanel3 = new JPanel();
        JButton switchButton3 = new JButton("Далі");
        switchButton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (thirdCRadioButton.isSelected()) {
                    numberOfPoints += 5;
                } else {
                    numberOfPoints += 2;
                }
                cardLayout.show(cardPanel, "window4");
            }
        });
        bottomPanel3.add(switchButton3);

        window3.add(bottomPanel3, BorderLayout.SOUTH);
    }

    // Вікно результатів тестування
    private void createWindow4() {
        window4 = new JPanel(new BorderLayout());

        JPanel centerPanel4 = new JPanel();
        centerPanel4.setLayout(new BoxLayout(centerPanel4, BoxLayout.Y_AXIS));

        centerPanel4.add(new JLabel("Тест пройдено"));
        JLabel pointsLabel = new JLabel("Кількість балів: " + numberOfPoints);
        centerPanel4.add(pointsLabel);
        window4.add(centerPanel4, BorderLayout.CENTER);

        JPanel bottomPanel4 = new JPanel();
        JButton switchButton4 = new JButton("Завершити тестування");
        switchButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Кількість балів: " + numberOfPoints / 3);
                frame.dispose();
            }
        });

        bottomPanel4.add(switchButton4);

        window4.add(bottomPanel4, BorderLayout.SOUTH);
    }
