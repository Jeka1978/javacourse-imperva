package com.imperva.guess_game;

import com.imperva.lombok_examples.Person;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 28/06/2017.
 */
public class GameManager {
    private Random random = new Random();
    private Player player = new Player("Noname",0);


    public void play(int max) {
        int numberOfTries = 0;
        int randomInt = random.nextInt(max) + 1;
        int userInput = 0;
        while (userInput != randomInt) {
            String input = null;
            try {
                input = JOptionPane.showInputDialog("input your number");
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            userInput = Integer.parseInt(input);
            if (userInput > randomInt) {
                JOptionPane.showMessageDialog(null, "too big");
            }
            if (userInput < randomInt) {
                JOptionPane.showMessageDialog(null, "too low");
            }
            numberOfTries++;
        }
        JOptionPane.showMessageDialog(null, "you won!!!");

        updateBestScore(((double) max) / numberOfTries);


    }

    private void updateBestScore(double score) {
        if (score > player.getScore()) {
            String name = JOptionPane.showInputDialog("what is your name?");
            player = new Player(name, score);

        }

    }

    public void printBestScores() {
        System.out.println("*****************************BEST SCORES****************************************");
        System.out.println(player);
        System.out.println("*****************************BEST SCORES****************************************");
    }

    public static void main(String[] args) {
        GameManager gameManager = new GameManager();
        gameManager.play(20);
        gameManager.printBestScores();
        gameManager.play(10);
        gameManager.printBestScores();

    }
}









