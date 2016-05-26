public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(2, 5, 2);
        try {
            Circle circle1 = circle.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
