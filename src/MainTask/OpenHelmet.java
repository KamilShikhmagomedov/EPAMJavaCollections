package MainTask;

public class OpenHelmet extends HeadProtection {

    public OpenHelmet(int weight, int price, int headSize) {
        super(weight, price, headSize);
    }

    @Override
    public void protectionChin() {
        System.out.println("Шлем без защиты подбородка");
    }

    @Override
    public String toString() {
        return "Открытый шлем";
    }
}
