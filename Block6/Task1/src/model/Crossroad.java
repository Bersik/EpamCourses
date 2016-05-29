package model;

import entity.GroundTransport;
import entity.Motorcycle;
import entity.Truck;

import java.util.LinkedList;
import java.util.List;

/**
 * Created on 5:43 29.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Crossroad {
    private List<GroundTransport> traffic;

    public Crossroad() {
        traffic = new LinkedList<>();
    }

    public Crossroad(List<GroundTransport> traffic) {
        this.traffic = traffic;
    }

    public int getCountTransport() {
        return traffic.size();
    }

    public int getCountTrucks() {
        int count = 0;
        for (GroundTransport transport : traffic) {
            if (transport instanceof Truck) {
                count++;
            }
        }
        return count;
    }

    public boolean checkBike(String name, String licensePlateNumber) {
        for (GroundTransport transport : traffic) {
            if (transport instanceof Motorcycle) {
                Motorcycle motorcycle = (Motorcycle) transport;
                if (motorcycle.getName().equals(name) && motorcycle.getLicensePlateNumber().equals(licensePlateNumber)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void addTransport(GroundTransport transport) {
        traffic.add(transport);
    }

}
