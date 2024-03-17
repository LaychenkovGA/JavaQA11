package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void turnOnTheNextRadioStation() {
        Radio radioStations = new Radio();
        radioStations.setCurrentRadioStation(1);
        radioStations.next();

        int expected = 2;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turnOnThePreviousRadioStation() {
        Radio radioStations = new Radio();
        radioStations.setCurrentRadioStation(5);
        radioStations.prev();

        int expected = 4;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void turningOnTheFirstRadioStation() {
        Radio radioStations = new Radio();
        radioStations.setCurrentRadioStation(9);
        radioStations.next();

        int expected = 0;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void playingTheLastRadioStation() {
        Radio radioStations = new Radio();
        radioStations.setCurrentRadioStation(0);
        radioStations.prev();

        int expected = 9;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnToFirstRadioStation() {
        Radio radioStations = new Radio();
        radioStations.setCurrentRadioStation(10);

        int expected = 0;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void returnToOriginalRadioStation() {
        Radio radioStations = new Radio();
        radioStations.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = radioStations.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radioStations = new Radio();
        radioStations.setSoundVolume(75);
        radioStations.turnUpTheVolume();

        int expected = 76;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio radioStations = new Radio();
        radioStations.setSoundVolume(75);
        radioStations.turnDownTheVolume();

        int expected = 74;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeWillNotIncrease() {
        Radio radioStations = new Radio();
        radioStations.setSoundVolume(101);
        radioStations.turnUpTheVolume();

        int expected = 100;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void theVolumeWillNotDecrease() {
        Radio radioStations = new Radio();
        radioStations.setSoundVolume(-1);
        radioStations.turnDownTheVolume();

        int expected = 0;
        int actual = radioStations.getSoundVolume();

        Assertions.assertEquals(expected, actual);
    }
}
