package entity;

/**
 * Created on 5:44 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public abstract class GroundTransport implements Transport {
    protected String name;
    protected String licensePlateNumber;
    protected String color;

    public GroundTransport() {
    }

    public GroundTransport(String name, String licensePlateNumber, String color) {
        this.name = name;
        this.licensePlateNumber = licensePlateNumber;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public void setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "GroundTransport{" +
                "color='" + color + '\'' +
                ", licensePlateNumber='" + licensePlateNumber + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
