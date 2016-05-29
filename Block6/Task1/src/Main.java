import entity.Car;
import entity.GroundTransport;
import entity.Truck;
import entity.Motorcycle;
import model.Crossroad;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 6:04 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Main {
    public static void main(String[] args) {
        List<GroundTransport> groundTransports = new LinkedList<>(Arrays.asList(
                new Motorcycle("DNEPR", "MA 102-99 I", "black", true),
                new Car("Mercedes", "BK 154-85 P", "white", 5),
                new Truck("SCANIA", "TT 554-25 O", "black", 20000),
                new Car("BMW", "AI 254-95 C", "black", 3),
                new Motorcycle("YAMAHA", "CA 234-34 B", "green", false),
                new Truck("RENO", "BE 215-15 E", "black", 17000)
        ));
        Crossroad crossroad = new Crossroad(groundTransports);

        System.out.println("Count transport: " + crossroad.getCountTransport());
        System.out.println("Count trucks: " + crossroad.getCountTrucks());
        System.out.println("Check motorcycle with name 'YAMAHA' and license plate number 'CA 234-34 B': " +
                crossroad.checkBike("YAMAHA", "CA 234-34 B"));

    }
}
