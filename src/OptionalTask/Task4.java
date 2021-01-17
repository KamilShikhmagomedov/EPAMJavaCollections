package OptionalTask;

//Ввести строки из файла, записать в список ArrayList. Выполнить сортировку строк, используя метод sort() из класса Collections.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Task4 {
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
        Collections.sort(list);
        System.out.println(list);
    }
}
