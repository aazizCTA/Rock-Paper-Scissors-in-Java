package com.cta.training.rockpaperscissors;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Game {
    boolean rerun = true;

    public void playGame() {
        User user = new User();
        InternalGameLogic gameSetup = new InternalGameLogic();

        do {
            gameSetup.generateComputerGuess();
            String computerGuess = gameSetup.getComputerGuess();

            user.setUserGuessInput();
            int userGuessInput = user.getUserGuessInput();
            gameSetup.convertUserGuess(userGuessInput);
            String userGuess = gameSetup.getUserGuess();

            gameSetup.compareInputs(computerGuess, userGuess);

            String result = gameSetup.getResult();

            //result logic, can be added to a separate class in future
            if (result.equals("Draw")){
                System.out.println("Computer: "+computerGuess);
                System.out.println("User: "+userGuess);
                System.out.println(result+ ", let's play again");
                rerun = true;
            }else if (result.equals("Computer Wins")){
                System.out.println("Computer: "+computerGuess);
                System.out.println("User: "+userGuess);
                System.out.println(result);
                rerun = false;
            }else{
                System.out.println("Computer: "+computerGuess);
                System.out.println("User: "+userGuess);
                System.out.println(result);
                rerun = false;
            }



        }while(rerun);




    }
}
