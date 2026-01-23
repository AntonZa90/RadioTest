public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setIncreaseTheVolumeByOne(int newCurrentVolume) {
        currentVolume = newCurrentVolume;

        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = 100;
        }
    }

    public void setReduceTheVolumeByOne(int newReduceVolume) {
        currentVolume = newReduceVolume;
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setSwitchingTheRadioWavesAhead(int newCurrentRadioStationNumber) {
        currentRadioStationNumber = newCurrentRadioStationNumber;

        if (currentRadioStationNumber > 9) {
            currentRadioStationNumber = 0;
        } else {
            currentRadioStationNumber = currentRadioStationNumber;
        }
    }

    public void setSwitchingTheRadioWaveBack(int newCurrentRadioStationNumber) {
        currentRadioStationNumber = newCurrentRadioStationNumber;

        if (currentRadioStationNumber < 0) {
            currentRadioStationNumber = 9;
        } else {
            currentRadioStationNumber = currentRadioStationNumber;
        }
    }
}