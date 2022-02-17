package com.larsondev;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerCLI {

    private Menu menu;
    private Manager manager;

    public ManagerCLI(Menu menu) {
        this.menu = menu;
        this.manager = new Manager();
        try {
            this.manager.run();
        } catch (FileNotFoundException e) {
            menu.displayError("File Not Found.");
        }
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        ManagerCLI manager = new ManagerCLI(menu);
        manager.run();
    }

    public void run() {
        menu.showWelcomeMessage();
        runMainMenu();
    }

    public void runMainMenu() {
        while (true) {
            int choice1 = menu.showMainMenu();
            if (choice1 == 1) {
                menu.printLibrary(manager.getLibrary());
            } else if (choice1 == 2) {
                gameSelect();
            } else if (choice1 == 3) {
                break;
            }
        }
    }

    public void gameSelect() {
        while (true) {
            int choice = menu.showGameSelectMenu();
            if (choice == 1) {
                int players = menu.askNumberOfPlayers();
                int timeAvailable = menu.askTimeAvailable();
                menu.printAdjustedLibrary(manager.getLibrary(), players, timeAvailable);
            } else if (choice == 2) {
                break;
            } else if (choice == 3) {
                break;
            }
        }
    }
}
