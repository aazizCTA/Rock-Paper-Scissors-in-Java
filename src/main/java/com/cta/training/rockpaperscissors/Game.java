package com.cta.training.rockpaperscissors;


public class Game {
    boolean rerun = true;

    public void playGame() {
        User user = new User();
        GameLogic game = new GameLogic();
        ComputerGuess computerGuess = new ComputerGuess();
        UserGuess userGuess = new UserGuess();


        String username = user.getUser();
        System.out.println("Okay "+username+", the game's Rock Paper Scissors, let's begin!");
    }
}
