package com.cta.training.rockpaperscissors;

public class GameLogic {
    String result;
    boolean rerun;

    public void setResult(String computerGuess, String userGuess){
        if (userGuess.equals(computerGuess)){
            this.result =("Draw");
        }else if ((userGuess.equals("rock") && computerGuess.equals("paper"))
                || (userGuess.equals("paper") && computerGuess.equals("scissors"))
                || (userGuess.equals("scissors") && computerGuess.equals("rock"))){
            this.result=("Computer Wins");
        }else{
            this.result=("User Wins");
        }
    }

    public String getResult(){
        return result;
    }

    public void setRerun(){
        if (result.equals("Draw")){
            rerun = true;
        }else if (result.equals("Computer Wins")){
            rerun = false;
        }else{
            rerun = false;
        }
    }

    public boolean getRerun(){
        return rerun;
    }



}
