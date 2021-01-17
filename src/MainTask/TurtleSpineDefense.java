package MainTask;

public class TurtleSpineDefense extends SpineProtection {

    public TurtleSpineDefense(int weight, int price, int backSize) {
        super(weight, price, backSize);
    }

    @Override
    public void backProtectionOption() {
        System.out.println("Защита спины черепашка");
    }

    @Override
    public String toString() {
        return "Каркас черепашка";
    }
}
