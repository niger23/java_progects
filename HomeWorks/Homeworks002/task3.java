// Дана json строка (можно сохранить в файл и читать из файла)
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Написать метод(ы), который распарсит json и, используя 
// StringBuilder, создаст строки вида: Студент [фамилия] получил 
// [оценка] по предмету [предмет].
// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.


package HomeWorks.Homeworks002;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class task3 {
    public static void main(String[] args) throws Exception {

        Map<String, String> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        BufferedReader in = new BufferedReader(new FileReader("HomeWorks/Homeworks002/task3.json"));
        String line = "";
        while ((line = in.readLine()) != null) {
            sb.append(line);
        }
        String[] lines = sb.substring(1, sb.length() - 2).replaceAll("[\"{\\s+]","").split("},");
        for (int i = 0; i < lines.length; i++) {
    
            String[] partLine = lines[i].split("[,:]");
            for (int j = 1; j < partLine.length; j+=2) {
                map.put(partLine[j-1], partLine[j]);                   
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n",map.get("surname"), map.get("score"), map.get("lesson"));
        }
        in.close();
    }
}

