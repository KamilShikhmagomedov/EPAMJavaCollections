package MainTask;

public class LegsProtection extends MotoGear {
    int legsSize;

    public LegsProtection(int weight, int price, int legsSize) {
        super(weight, price);
        this.legsSize = legsSize;
    }

    public int getLegsSize() {
        return legsSize;
    }

    public void setLegsSize(int legsSize) {
        this.legsSize = legsSize;
    }

    public void legsProtection(){
        System.out.println("Защита ног");
    }

    @Override
    public String toString() {
        return "Защита ног";
    }
}
