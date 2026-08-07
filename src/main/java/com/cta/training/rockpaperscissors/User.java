package com.cta.training.rockpaperscissors;

import java.util.Scanner;

public class User {
    String username;
    int userGuessInput;

    public void setUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name");
        username = scanner.next();
    }

    public String getUser() {
        return username;
    }

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
}