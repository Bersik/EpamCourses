package task;

import task.location.Location;
import task.see.See;
import task.state.Activity;

/**
 * Created on 11:00 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Human {
    private Activity state;
    private Location location;
    private See see;

    public Human() {
    }

    public Human(Activity state, Location location, See see) {
        this.state = state;
        this.location = location;
        this.see = see;
    }

    public void doSomething(){
        location.doSomething(this);
        see.doSomething(this);
        state.doSomething(this);
    }

    public Activity getState() {
        return state;
    }

    public void setState(Activity state) {
        this.state = state;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public See getSee() {
        return see;
    }

    public void setSee(See see) {
        this.see = see;
    }
}
