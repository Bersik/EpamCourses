package state.radio;

/**
 * Created on 10:14 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Radio {
    Station station;

    void setStation(Station station) {
        this.station = station;
    }

    void nextStation() {
        if (station instanceof Radio7) {
            setStation(new RadioDFM());
        } else if (station instanceof RadioDFM) {
            setStation(new VestiFM());
        } else if (station instanceof VestiFM) {
            setStation(new Radio7());
        }
    }

    void play(){
        station.play();
    }
}
