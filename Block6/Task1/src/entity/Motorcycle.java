package entity;

/**
 * Created on 5:52 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Motorcycle extends GroundTransport{
    private boolean wheelchair;

    public Motorcycle() {
    }

    public Motorcycle(String name, String licensePlateNumber, String color, boolean wheelchair) {
        super(name, licensePlateNumber, color);
        this.wheelchair = wheelchair;
    }

    @Override
    public int speed() {
        return 50;
    }

    @Override
    public void move() {
        System.out.println("We are moving by ground in the lorry; is wheelchair: " + wheelchair);
    }

    public boolean isWheelchair() {
        return wheelchair;
    }

    public void setWheelchair(boolean wheelchair) {
        this.wheelchair = wheelchair;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "wheelchair=" + wheelchair +
                "} " + super.toString();
    }
}
