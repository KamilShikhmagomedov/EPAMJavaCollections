package MainTask;

// Задание: Мотоциклист.
// Определить иерархию амуниции. Экипировать мотоциклиста.
// Подсчитать стоимость. Провести сортировку амуниции на основе веса.
// Найти элементы амуниции, соответствующие заданному диапазону параметров цены.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // Инициализируем экипировку мотоциклиста:
        HeadProtection helmet = new ClosedHelmet(2, 21_000, 58);
        ChestProtection chest = new ChestProtection(5, 17_000, 48);
        SpineProtection spine = new JacketSpineDefense(8, 42_000, 48);
        HandsProtection hands = new HardDefenseGloves(2, 5_000, 22);
        LegsProtection legs = new LegsProtection(6, 19_000, 42);

        ArrayList<MotoGear> biker = new ArrayList<>();
        biker.add(helmet);
        biker.add(chest);
        biker.add(spine);
        biker.add(hands);
        biker.add(legs);

        // Сумма аммуниции
        int sum = biker.stream().mapToInt(MotoGear::getPrice).sum();
        System.out.println("Стоимость всей экипировки - " + sum);

        // Сортировка экипировки по весу
        System.out.println(biker);
        biker.sort(Comparator.comparing(MotoGear::getWeight));
        System.out.println(biker);

        // Найти элементы амуниции, стоящие от 3000 до 20000;
        biker.removeIf(o -> o.getPrice() < 3000 || o.getPrice() > 20000);
        System.out.println(biker);
    }
}
