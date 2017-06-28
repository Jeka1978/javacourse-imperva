package com.imperva.inner_ananimous_classes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class ColorFrame extends JFrame {
    public ColorFrame() {
        setSize(500, 500);
        JPanel panel = new JPanel();
        int[] x = new int[1];

        JButton button = new JButton("click to change color");

        button.addActionListener(e -> {
            panel.setBackground(Color.BLUE);
            panel.repaint();

            x[0]++;

        });

        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(button, BorderLayout.NORTH);

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }


    public static void main(String[] args) {
        new ColorFrame();
    }


}



