package com.cta.training.rockpaperscissors;

import java.util.Scanner;

public class UserGuess {
    int userGuessInput;
    String userGuess;

    public void setUserGuessInput() {
        boolean inputValidation = true;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Please enter your guess: Rock|Paper|Scissors (Input via 1|2|3)");
            this.userGuessInput = Integer.parseInt(scanner.next());
            if ((userGuessInput == 1) || (userGuessInput == 2) || (userGuessInput == 3)) {
                inputValidation = true;
            } else {
                System.out.println("Invalid input, please try again.");
                inputValidation = false;
            }
        } while (!inputValidation);
    }

    public int getUserGuessInput(){
        return userGuessInput;
    }

    public void convertUserGuess(int userGuessInput){
        userGuessInput = getUserGuessInput();
        if (userGuessInput == 1) {
            this.userGuess = "rock";
        } else if (userGuessInput == 2) {
            this.userGuess = "paper";
        } else {
            this.userGuess = "scissors";
        }
    }

    public String getUserGuess(){
        return userGuess;
    }

}
