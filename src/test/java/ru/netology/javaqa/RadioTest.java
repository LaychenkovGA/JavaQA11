package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radioStations = new Radio(10);

    @Test
    public void turnOnTheNextRadioStation() {
        int includedStation = 10;
        radioStations.setCurrentRadioStation(includedStation);
        radioStations.next();

        int expected = 0;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnTheNextRadioStation2() {
        int includedStation = 5;
        radioStations.setCurrentRadioStation(includedStation);
        radioStations.next();

        int expected = 6;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnThePreviousRadioStation() {
        int includedStation = 0;
        radioStations.setCurrentRadioStation(includedStation);
        radioStations.prev();

        int expected = 10;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnThePreviousRadioStation2() {
        int includedStation = 5;
        radioStations.setCurrentRadioStation(includedStation);
        radioStations.prev();

        int expected = 4;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void inputRadioStation() {
        int radioStation = -1;
        int includedStation = 3;
        radioStations.setCurrentRadioStation(includedStation);
        radioStations.inputRadioStation(radioStation);

        int expected = 3;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void inputRadioStation2() {
        int radioStation = 11;
        int includedStation = 5;
        radioStations.setCurrentRadioStation(includedStation);
        radioStations.inputRadioStation(radioStation);

        int expected = 5;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        int SoundVolume = 75;
        radioStations.setSoundVolume(SoundVolume);
        radioStations.turnUpTheVolume();

        int expected = 76;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        int SoundVolume = 75;
        radioStations.setSoundVolume(SoundVolume);
        radioStations.turnDownTheVolume();

        int expected = 74;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeWillNotIncrease() {
        int SoundVolume = 101;
        radioStations.setSoundVolume(SoundVolume);
        radioStations.turnUpTheVolume();

        int expected = 100;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeWillNotIncrease2() {
        int SoundVolume = -1;
        radioStations.setSoundVolume(SoundVolume);
        radioStations.turnDownTheVolume();

        int expected = 0;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}

