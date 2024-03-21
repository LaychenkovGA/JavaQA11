package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radioStations = new Radio(10);

    @Test
    public void turnOnTheNextRadioStation() {
        radioStations.setCurrentRadioStation(10);
        radioStations.setNextNumberStation();

        int expected = 1;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnTheNextRadioStation2() {
        radioStations.setCurrentRadioStation(5);
        radioStations.setNextNumberStation();

        int expected = 6;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnThePreviousRadioStation() {
        radioStations.setCurrentRadioStation(0);
        radioStations.setPrevNumberStation();

        int expected = 9;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnThePreviousRadioStation2() {
        radioStations.setCurrentRadioStation(5);
        radioStations.setPrevNumberStation();

        int expected = 4;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void inputRadioStation() {
        radioStations.setCurrentRadioStation(15);

        int expected = 0;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void inputRadioStation2() {
        radioStations.setCurrentRadioStation(-15);

        int expected = 0;
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

