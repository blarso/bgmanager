package com.larsondev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class LibraryFileReader {

    private Map<String, BoardGame> startingLibrary = new TreeMap<>();

    public LibraryFileReader () throws FileNotFoundException {
        loadLibraryFromFile();
    }

    public Map<String, BoardGame> getStartingLibrary() {
        return this.startingLibrary;
    }

    private void loadLibraryFromFile() throws FileNotFoundException {
        String inventoryFileName = "BGManagerLibrary.csv";
        File filename = new File(inventoryFileName);
        try (Scanner libraryScanner = new Scanner(filename)) {
            while (libraryScanner.hasNextLine()) {
                String line = libraryScanner.nextLine();
                BoardGame newGame = buildGameFromLine(line);
                startingLibrary.put(newGame.getGameID(), newGame);
            }
        }
    }

    private BoardGame buildGameFromLine(String line) {
        BoardGame boardGame = null;
        String [] parts = line.split("\\|");
        String gameID = parts[0];
        String titleOfGame = parts[1];
        int minimumPlayers = Integer.parseInt(parts[2]);
        int maximumPlayers = Integer.parseInt(parts[3]);
        int estimatedPlayingTime = Integer.parseInt(parts[4]);
        double bggWeight = Double.parseDouble(parts[5]);
        double bggRating = Double.parseDouble(parts[6]);
        String description = parts[7];
        ArrayList<String> categories = new ArrayList<String>(Arrays.asList(parts[8], parts[9], parts [10], parts[11], parts[12]));

        boardGame = new BoardGame(gameID, titleOfGame, minimumPlayers, maximumPlayers,
                estimatedPlayingTime, bggWeight, bggRating, description, categories);

        return boardGame;
    }
}
