package OptionalTask;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

// Ввести строки из файла, записать в список. Вывести строки в файл в обратном порядке.

public class Task1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src//OptionalTask//Task1info.txt"));
        ArrayList<String> list = new ArrayList<>();
        while (bufferedReader.ready()){
            list.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        Collections.reverse(list);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src//OptionalTask//Task1info2.txt"));
        for (int i = 0; i < list.size(); i++) {
            bufferedWriter.write(list.get(i) + "\n");
        }
        bufferedWriter.close();
    }
}
