package MainTask;

public abstract class HeadProtection extends MotoGear {
    private int headSize;

    public HeadProtection(int weight, int price, int headSize) {
        super(weight, price);
        this.headSize = headSize;
    }

    public int getHeadSize() {
        return headSize;
    }

    public void setHeadSize(int headSize) {
        this.headSize = headSize;
    }

    public abstract void protectionChin();

    @Override
    public String toString() {
        return "Шлем";
    }
}
