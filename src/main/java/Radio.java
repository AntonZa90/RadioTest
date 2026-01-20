public class Radio {
    public int currentRadioStationNumber;
    public int currentVolume;


    public void setCurrentVolume(int newCurrentVolume) {
        currentVolume = newCurrentVolume;

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else currentVolume = 100;
    }

    public void setReduceVolume(int newReduceVolume) {
        currentVolume = newReduceVolume;
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else currentVolume = 0;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        currentRadioStationNumber = newCurrentRadioStationNumber;

        if (currentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        } else currentRadioStationNumber = currentRadioStationNumber;
        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = 9;
        }
    }
}