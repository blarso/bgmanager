package com.larsondev;

import java.io.FileNotFoundException;
import java.util.Map;

public class Manager {

    private Map<String, BoardGame> library;

    public void run() throws FileNotFoundException {

        LibraryFileReader libraryBuilder = new LibraryFileReader();
        this.library = libraryBuilder.getStartingLibrary();

    }

    public Map<String, BoardGame> getLibrary() {
        return library;
    }
}
