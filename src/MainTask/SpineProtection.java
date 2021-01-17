package MainTask;

public abstract class SpineProtection extends MotoGear {
    private int backSize;

    public SpineProtection(int weight, int price, int backSize) {
        super(weight, price);
        this.backSize = backSize;
    }

    public int getBackSize() {
        return backSize;
    }

    public void setBackSize(int backSize) {
        this.backSize = backSize;
    }

    public abstract void backProtectionOption();

    @Override
    public String toString() {
        return "Защита спины";
    }
}
