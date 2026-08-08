package com.cta.training.rockpaperscissors;


public class Game {

    public void playGame() {
        User user = new User();
        GameLogic game = new GameLogic();
        ComputerGuess computerGuess = new ComputerGuess();
        UserGuess userGuess = new UserGuess();

        user.setUser();
        String username = user.getUser();
        System.out.println("Okay "+username+", the game's Rock Paper Scissors, let's begin!");

        boolean rerun = true;

        do {
            computerGuess.generateComputerGuess();
            String cGuess = computerGuess.getComputerGuess();

            System.out.println(cGuess);//for manual testing

            userGuess.setUserGuessInput();
            int userGuessInput = userGuess.getUserGuessInput();
            userGuess.convertUserGuess(userGuessInput);
            String uGuess = userGuess.getUserGuess();

            game.setResult(cGuess,uGuess);
            String result = game.getResult();
            game.setRerun();
            rerun = game.getRerun();

            System.out.println("Computer: "+cGuess);
            System.out.println("User: "+uGuess);
            System.out.println(result);

        }while(rerun);
    }
}
