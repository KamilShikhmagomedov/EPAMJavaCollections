package MainTask;

public class ChestProtection extends MotoGear {
    int chestSize;

    public ChestProtection(int weight, int price, int chestSize) {
        super(weight, price);
        this.chestSize = chestSize;
    }

    public void protectionChest(){
        System.out.println("Защита груди");
    }

    @Override
    public String toString() {
        return "Защита груди";
    }
}
