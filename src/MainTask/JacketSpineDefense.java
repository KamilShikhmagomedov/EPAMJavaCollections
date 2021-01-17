package MainTask;

public class JacketSpineDefense extends SpineProtection {

    public JacketSpineDefense(int weight, int price, int backSize) {
        super(weight, price, backSize);
    }

    @Override
    public void backProtectionOption() {
        System.out.println("Защита спины в комплекте с курткой");
    }

    @Override
    public String toString() {
        return "Куртка с защитой спины";
    }
}
