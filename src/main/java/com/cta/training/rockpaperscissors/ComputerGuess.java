package com.cta.training.rockpaperscissors;

public class ComputerGuess {
    String computerGuess;

    protected void generateComputerGuess(){
        int randomNum = (int) (Math.random() * 3); // 0 to 2
        if (randomNum == 0) {
            this.computerGuess = "rock";
        } else if (randomNum == 1) {
            this.computerGuess = "paper";
        } else {
            this.computerGuess = "scissors";
        }
    }

    public String getComputerGuess(){
        return computerGuess;
    }
}
