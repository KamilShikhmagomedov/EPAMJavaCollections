package MainTask;

public class LightweightGloves extends HandsProtection {
    public LightweightGloves(int weight, int price, int handsSize) {
        super(weight, price, handsSize);
    }

    @Override
    public void handsProtectionOption() {
        System.out.println("Легкие перчатки");
    }

    @Override
    public String toString() {
        return "Легкие перчатки";
    }
}
