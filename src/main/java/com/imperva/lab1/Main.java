package com.imperva.lab1;

import lombok.EqualsAndHashCode;

import javax.swing.*;

/**
 * Created by Evegeny on 25/06/2017.
 */
public class Main {
    public static void main(String[] args) {
        int userInput = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
        System.out.println(userInput*2);
    }
}
