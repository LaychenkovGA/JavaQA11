package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;
    private int zeroRadioStation = 0;
    private int numberOfRadioStations = 10;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public Radio(int numberOfRadioStations) {
        this.numberOfRadioStations = numberOfRadioStations;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > numberOfRadioStations - 1) {
            return;
        }
        if (currentRadioStation < zeroRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextNumberStation() {
        if (currentRadioStation < numberOfRadioStations - 1) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = 0;
        }
    }

    public void setPrevNumberStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = numberOfRadioStations - 1;
        }
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume >= maxSoundVolume) {
            soundVolume = 100;
        }
        if (soundVolume <= minSoundVolume) {
            soundVolume = 0;
        }
        this.soundVolume = soundVolume;
    }

    public void turnUpTheVolume() {
        int soundVolume = this.getSoundVolume();
        if (soundVolume >= maxSoundVolume) {
            soundVolume = 100;
        } else {
            this.soundVolume++;
        }
    }

    public void turnDownTheVolume() {
        int soundVolume = this.getSoundVolume();
        if (soundVolume <= minSoundVolume) {
            soundVolume = 0;
        } else {
            this.soundVolume--;
        }
    }
}