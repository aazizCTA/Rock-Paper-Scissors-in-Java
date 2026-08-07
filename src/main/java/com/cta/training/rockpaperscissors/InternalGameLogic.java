package com.cta.training.rockpaperscissors;

public class InternalGameLogic {
    String computerGuess;
    String userGuess;
    String result;

    public void generateComputerGuess(){
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

    public void compareInputs(String computerGuess, String userGuess){
        if (userGuess.equals(computerGuess)){
            this.result =("Draw");
        }else if ((userGuess.equals("rock") && computerGuess.equals("paper")) || (userGuess.equals("paper") && computerGuess.equals("scissors")) || (userGuess.equals("scissors") && computerGuess.equals("rock"))){
            this.result=("Computer Wins");
        }else{
            this.result=("User Wins");
        }
    }

    public String getResult(){
        return result;
    }

    public void convertUserGuess(int userGuessInput){

        if (userGuessInput == 0) {
            this.userGuess = "rock";
        } else if (userGuessInput == 1) {
            this.userGuess = "paper";
        } else {
            this.userGuess = "scissors";
        }
    }

    public String getUserGuess(){
        return userGuess;
    }

}
