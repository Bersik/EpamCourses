package entity;

/**
 * Created on 5:53 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Car extends GroundTransport{
    private int doorsNumber;
    private int maxPassengers;

    public Car() {
    }

    public Car(String name, String licensePlateNumber, String color, int doorsNumber) {
        super(name, licensePlateNumber, color);
        this.doorsNumber = doorsNumber;
    }

    @Override
    public int speed() {
        return 90;
    }

    @Override
    public void move() {
        System.out.println("We are moving by ground in the car; count passengers: " + maxPassengers);
    }

    public int getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doorsNumber=" + doorsNumber +
                ", maxPassengers=" + maxPassengers +
                "} " + super.toString();
    }
}
