package MainTask;

public abstract class HandsProtection extends MotoGear {
    int handsSize;

    public HandsProtection(int weight, int price, int handsSize) {
        super(weight, price);
        this.handsSize = handsSize;
    }

    public int getHandsSize() {
        return handsSize;
    }

    public void setHandsSize(int handsSize) {
        this.handsSize = handsSize;
    }

    public abstract void handsProtectionOption();

    @Override
    public String toString() {
        return "Защита рук";
    }
}
