import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void currentVolumeTest() {
        Radio radio = new Radio();
        radio.setCurrentVolume(15);
        int expected = 15;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryVolumeValues1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryVolumeValues2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryVolumeValues3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryVolumeValues4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryVolumeValues5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryVolumeValues6() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeByOne1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseTheVolumeByOne();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeByOne2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.increaseTheVolumeByOne();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeByOne3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseTheVolumeByOne();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseTheVolumeByOne4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseTheVolumeByOne();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceTheVolumeByOne1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceTheVolumeByOne();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceTheVolumeByOne2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceTheVolumeByOne();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationNumbeTest() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        int expected = 5;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesOfTheRadioStation1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesOfTheRadioStation2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesOfTheRadioStation3() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesOfTheRadioStation4() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesOfTheRadioStation5() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void boundaryValuesOfTheRadioStation6() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choosingARadioStationPrev1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(-1);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choosingARadioStationPrev2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.prev();
        int expected = 4;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choosingARadioStationNext1() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void choosingARadioStationNext2() {
        Radio radio = new Radio();
        radio.setCurrentRadioStationNumber(5);
        radio.next();
        int expected = 6;
        int actual = radio.getCurrentRadioStationNumber();
        Assertions.assertEquals(expected, actual);
    }
}



