package state.radio;

/**
 * Created on 10:24 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Main {
    public static void main(String[] args) {
        Station dfm = new RadioDFM();
        Radio radio = new Radio();
        radio.setStation(dfm);

        for (int i = 0; i < 10; i++) {
            radio.nextStation();
            radio.play();
        }
    }
}
