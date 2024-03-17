package ru.netology.javaqa;

public class Radio {
    private int currentRadioStation;
    private int soundVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    protected void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
        } else {
            currentRadioStation = currentRadioStation + 1;
        }
    }

    protected void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
        } else {
            currentRadioStation = currentRadioStation - 1;
        }
    }

    protected void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    protected void setSoundVolume(int newSoundVolume) {
        soundVolume = newSoundVolume;
    }

    protected void turnUpTheVolume() {
        if (soundVolume >= 100) {
            soundVolume = 100;
        } else {
            soundVolume = soundVolume + 1;
        }
    }

    protected void turnDownTheVolume() {
        if (soundVolume <= 0) {
            soundVolume = 0;
        } else {
            soundVolume = soundVolume - 1;
        }
    }
}
