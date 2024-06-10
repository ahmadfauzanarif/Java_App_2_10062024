/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fauzancompany.java_app_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author D-22
 */
public class Game {
    private int secretNumber;
    private int guessLimit;

    public Game(int guessLimit) {
        this.guessLimit = guessLimit;
    }
    
    public void generateNumber() {
        Random randomGenerator = new Random();
    }
    
    public int getGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tebakan Anda (1-100): ");
        return scanner.nextInt();
    }
    
    public String checkGuess(int guess) {
        if(guess == secretNumber) {
          return "Benar!";
        } else if (guess > secretNumber) {
            return "Terlalu tinggi, coba lagi!";
        } else {
            return "Terlalu rendah, coba lagi!";
        }
    }
    
    public void play() {
        generateNumber();
        int remainingGuesses = guessLimit;
    }
}
