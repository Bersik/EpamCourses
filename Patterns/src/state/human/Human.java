package state.human;

/**
 * Created on 10:26 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Human {
    private Activity state;

    public void setState(Activity state) {
        this.state = state;
    }

    public void doSomething(){
        state.doSomething(this);
    }
}
