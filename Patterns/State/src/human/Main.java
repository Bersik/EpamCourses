package human;

/**
 * Created on 10:43 26.05.2016
 *
 * @author Bersik (Serhii Kisilchuk)
 */
public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        human.setState(new Work());
        for (int i=0;i<10;i++){
            human.doSomething();
        }
    }
}
