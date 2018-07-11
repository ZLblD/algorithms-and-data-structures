package ru.geekbrains.Java1.Lesson7;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setBounds(600,300,400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("btn1");
        JButton btn2 = new JButton("btn2");
        JPanel jPanel = new JPanel(new GridLayout(1,2));
        JTextField jtf = new JTextField();

        jtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
               // super.keyPressed(e);
                if(e.getKeyCode() == KeyEvent.VK_ENTER) {
                    System.out.println(jtf.getText());
                }
            }
        });

        add(jtf, BorderLayout.NORTH);
        jPanel.add(btn1);
        jPanel.add(btn2);
        add(jPanel, BorderLayout.SOUTH);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("btn1");
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("btn2");
            }
        });

        JPanel panel = new JPanel();
        panel.setBackground(Color.ORANGE);
        add(panel, BorderLayout.CENTER);
      //  btn1.setPreferredSize(new Dimension(200,200));
       // setResizable(false);
        setVisible(true);
    }
}

class MainClassSwing {
    public static void main(String[] args) {
        new MyWindow();
    }
}

class DrawLine extends JPanel {
    @Override
    public void paintComponent(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawLine(20,20,20,120);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("DrawLine");
        frame.setSize(200,200);

        DrawLine panel = new DrawLine();

        frame.add(panel);
        frame.setVisible(true);
    }
}















