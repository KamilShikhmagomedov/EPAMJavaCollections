package MainTask;

public class HardDefenseGloves extends HandsProtection {
    public HardDefenseGloves(int weight, int price, int handsSize) {
        super(weight, price, handsSize);
    }

    @Override
    public void handsProtectionOption() {
        System.out.println("Жесткие перчатки");
    }

    @Override
    public String toString() {
        return "Жесткие перчатки";
    }
}
