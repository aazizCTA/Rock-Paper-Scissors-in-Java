package com.cta.training.rockpaperscissors;

public class GameLogic {
    String result;
    boolean rerun;

    protected void setResult(String computerGuess, String userGuess){
        if (userGuess.equals(computerGuess)){
            this.result =("Draw, let's play again");
        }else if ((userGuess.equals("rock") && computerGuess.equals("paper"))
                || (userGuess.equals("paper") && computerGuess.equals("scissors"))
                || (userGuess.equals("scissors") && computerGuess.equals("rock"))){
            this.result=("Computer Wins");
        }else{
            this.result=("User Wins");
        }
    }

    protected String getResult(){
        return result;
    }

    protected void setRerun(){
        if (result.equals("Draw, let's play again")){
            rerun = true;
        }else if (result.equals("Computer Wins")){
            rerun = false;
        }else{
            rerun = false;
        }
    }

    protected boolean getRerun(){
        return rerun;
    }



}
