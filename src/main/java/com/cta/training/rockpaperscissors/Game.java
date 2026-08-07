package com.cta.training.rockpaperscissors;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Game {

    public void playGame() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to rock paper scissors, you're playing me!");
        System.out.println("Please enter your guess: Rock|Paper|Scissors (Input via 1|2|3)");

        int userGuessInput = Integer.parseInt(scanner.next());
        String userGuess;

        if (userGuessInput == 1) {
            userGuess = "rock";
        } else if (userGuessInput == 2) {
            userGuess = "paper";
        } else {
            userGuess = "scissors";
        }

        int randomNum = (int) (Math.random() * 3); // 0 to 2
        String computerGuess;

        if (randomNum == 0) {
            computerGuess = "rock";
        } else if (randomNum == 1) {
            computerGuess = "paper";
        } else {
            computerGuess = "scissors";
        }

        //game logic
            if (userGuess.equals(computerGuess)){
                System.out.println("Draw");
            }else if ((userGuess.equals("rock") && computerGuess.equals("paper")) || (userGuess.equals("paper") && computerGuess.equals("scissors")) || (userGuess.equals("scissors") && computerGuess.equals("rock"))){
                System.out.println("Computer Wins");
            }else{
                System.out.println("User Wins");
            }
        System.out.println("Computer chose "+computerGuess);
        System.out.println("User chose "+userGuess);
    }
}
