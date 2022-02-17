package com.larsondev;

import java.util.Map;
import java.util.Scanner;

public class Menu {

    private static final Scanner userInput = new Scanner(System.in);

    public void showWelcomeMessage() {
        System.out.println("********************************");
        System.out.println("****  Welcome to BGManager  ****");
        System.out.println("********************************");
        System.out.println();
    }

    public int showMainMenu() {
        System.out.println();
        System.out.println("(1) Browse Library");
        System.out.println("(2) Select a Game");
        System.out.println("(3) Quit");
        System.out.print("Enter Choice >> ");
        return userInput.nextInt();
    }

    public void printLibrary(Map<String, BoardGame> library) {
        System.out.println();
        System.out.printf("%-6s%-35s%-8s%-10s%-12s%-60s\n", "Index", "Title", "Players", "Length", "Complexity", "Description");
        for (Map.Entry<String, BoardGame> boardGameEntry : library.entrySet()) {
            System.out.printf("%-6s%-35s%-8s%-10s%-12.2f%-60s\n", boardGameEntry.getKey(),
                    boardGameEntry.getValue().getTitleOfGame(),
                    boardGameEntry.getValue().getMinimumPlayers() + "-" + boardGameEntry.getValue().getMaximumPlayers(),
                    boardGameEntry.getValue().getEstimatedPlayingTime() + " min.", boardGameEntry.getValue().getBggWeight(),
                    boardGameEntry.getValue().getDescription());
        }
    }

    public int showGameSelectMenu() {
        System.out.println();
        System.out.println("(1) Don't Know What to Play?");
        System.out.println("(2) Play a Game");
        System.out.println("(3) Back to Main Menu");
        System.out.print("Enter Choice >> ");
        return userInput.nextInt();
    }

    public int askNumberOfPlayers() {
        System.out.println("How many players are playing?");
        return userInput.nextInt();
    }

    public int askTimeAvailable() {
        System.out.println("How long (in minutes) do you have available to play?");
        return userInput.nextInt();
    }

    public void printAdjustedLibrary(Map<String, BoardGame> library, int players, int timeAvailable) {
        System.out.println();
        System.out.printf("%-6s%-35s%-8s%-10s%-12s%-60s\n", "Index", "Title", "Players", "Length", "Complexity", "Description");
        for (Map.Entry<String, BoardGame> boardGameEntry : library.entrySet()) {
            if (players >= boardGameEntry.getValue().getMinimumPlayers() &&
                players <= boardGameEntry.getValue().getMaximumPlayers() &&
                timeAvailable >= boardGameEntry.getValue().getEstimatedPlayingTime()) {
                System.out.printf("%-6s%-35s%-8s%-10s%-12.2f%-60s\n", boardGameEntry.getKey(),
                        boardGameEntry.getValue().getTitleOfGame(),
                        boardGameEntry.getValue().getMinimumPlayers() + "-" + boardGameEntry.getValue().getMaximumPlayers(),
                        boardGameEntry.getValue().getEstimatedPlayingTime() + " min.", boardGameEntry.getValue().getBggWeight(),
                        boardGameEntry.getValue().getDescription());
            }
        }
    }

    public void displayError (String message) {
        System.out.println("***** ERROR *****");
        System.out.println(message);
        System.out.println();
    }

}
