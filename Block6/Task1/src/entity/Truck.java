package entity;

/**
 * Created on 5:46 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Truck extends GroundTransport {
    private int maxCapacity;

    public Truck() {
    }

    public Truck(String name, String licensePlateNumber, String color, int maxCapacity) {
        super(name, licensePlateNumber, color);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public int speed() {
        return 60;
    }

    @Override
    public void move() {
        System.out.println("We are moving by ground in the lorry; max capacity: " + maxCapacity);
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxCapacity=" + maxCapacity +
                "} " + super.toString();
    }
}
