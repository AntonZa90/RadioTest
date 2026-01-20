import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 16;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 100;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setReduceVolume(-1);
        int expected = 0;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        radio.setReduceVolume(15);
        int expected = 14;
        int actual = radio.currentVolume;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void changingTheRadioStationTo1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChangingTheRadioStationToMinus1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        int expected = 9;
        int actual = radio.currentRadioStationNumber;
        Assertions.assertEquals(expected, actual);
    }
}

