package com.cta.training.rockpaperscissors;

import java.util.Scanner;

public class User {
    String username;

    public void setUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        username = scanner.next();
    }

    public String getUser() {
        return username;
    }
}