package com.larsondev;

import java.util.Scanner;

public class Menu {

    private static final Scanner userInput = new Scanner(System.in);

    public void showWelcomeMessage() {
        System.out.println("********************************");
        System.out.println("***** Welcome to BGManager *****");
        System.out.println("********************************");
    }

    public int askNumberOfPlayers() {
        System.out.println("How many players are playing?");
        String totalNumberOfPlayers = userInput.nextLine();
        int numberOfPlayersToInt = Integer.parseInt(totalNumberOfPlayers);
        return numberOfPlayersToInt;
    }
}
