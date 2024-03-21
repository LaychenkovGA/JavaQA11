package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;
    private int minRadioStation = 0;
    private int maxRadioStation = 10;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;

    public Radio(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void next() {
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }

    public void prev() {
        int currentRadioStation = this.getCurrentRadioStation();
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }

    public void inputRadioStation(int RadioStation) {
        if (RadioStation > maxRadioStation) {
            return;
        }
        if (RadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = RadioStation;
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