package MainTask;

public class ClosedHelmet extends HeadProtection {

    public ClosedHelmet(int weight, int price, int headSize) {
        super(weight, price, headSize);
    }

    @Override
    public void protectionChin() {
        System.out.println("Шлем с защитой подбородка");
    }

    @Override
    public String toString() {
        return "Закрытый шлем";
    }
}
