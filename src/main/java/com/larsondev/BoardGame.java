package com.larsondev;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

public class BoardGame {

    private String titleOfGame;
    private int minimumPlayers;
    private int maximumPlayers;
    private int estimatedPlayingTime;
    private int recommendedAge;
    private double bggWeight;
    private double bggRating;
    private String description;
    private int numberOfTimesPlayed = 0;
    private LocalDate lastTimePlayed;
    private List<String> publishers = new ArrayList<String>();
    private List<String> designers = new ArrayList<String>();
    private List<String> categories = new ArrayList<String>();
    /*
        ***************CONSTRUCTOR****************
    */
    public BoardGame (String titleOfGame) {
        this.titleOfGame = titleOfGame;
    }

    /*
        *********GETTERS AND SETTERS**********
     */
    public int getNumberOfTimesPlayed() {
        return numberOfTimesPlayed;
    }

    public void setPublishers(List<String> publishers) {
        this.publishers = publishers;
    }

    public void setDesigners(List<String> designers) {
        this.designers = designers;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public LocalDate getLastTimePlayed() {
        return lastTimePlayed;
    }

    public List<String> getPublishers() {
        return publishers;
    }

    public List<String> getDesigners() {
        return designers;
    }

    public List<String> getCategories() {
        return categories;
    }

    public String getNameOfGame() {
        return titleOfGame;
    }

    public void setNameOfGame(String nameOfGame) {
        this.titleOfGame = nameOfGame;
    }

    public int getMinimumPlayers() {
        return minimumPlayers;
    }

    public void setMinimumPlayers(int minimumPlayers) {
        this.minimumPlayers = minimumPlayers;
    }

    public int getMaximumPlayers() {
        return maximumPlayers;
    }

    public void setMaximumPlayers(int maximumPlayers) {
        this.maximumPlayers = maximumPlayers;
    }

    public int getEstimatedPlayingTime() {
        return estimatedPlayingTime;
    }

    public void setEstimatedPlayingTime(int estimatedPlayingTime) {
        this.estimatedPlayingTime = estimatedPlayingTime;
    }

    public int getRecommendedAge() {
        return recommendedAge;
    }

    public void setRecommendedAge(int recommendedAge) {
        this.recommendedAge = recommendedAge;
    }

    public double getBggWeight() {
        return bggWeight;
    }

    public void setBggWeight(double bggWeight) {
        this.bggWeight = bggWeight;
    }

    public double getBggRating() {
        return bggRating;
    }

    public void setBggRating(double bggRating) {
        this.bggRating = bggRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    /*
        ***********METHODS*******************
     */
    public void playThisGame() {
        this.lastTimePlayed = LocalDate.now();
        this.numberOfTimesPlayed++;
    }
}
