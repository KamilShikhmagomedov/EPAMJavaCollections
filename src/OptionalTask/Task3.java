package OptionalTask;

// Занести стихотворение в список. Провести сортировку по возрастанию длин строк.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Task3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src//OptionalTask//Task1info.txt"));
        ArrayList<String> list = new ArrayList<>();
        String line = null;
        while (bufferedReader.ready()){
            line = bufferedReader.readLine();
            StringTokenizer tokenizer = new StringTokenizer(line, " ");
            while (tokenizer.hasMoreTokens()){
                list.add(tokenizer.nextToken());
            }
        }
        list.sort(Comparator.comparing(String::length));
        System.out.println(list);
    }
}
