// Дана строка sql-запроса "select * from students where ". 
// Сформируйте часть WHERE этого запроса, используя StringBuilder. 
// Данные для фильтрации приведены ниже в виде json строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: 
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}



package HomeWorks.Homeworks002;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class task1 {
    public static void main(String[] args) throws Exception {
        Map<String, String> data = loadData();
        System.out.println(data.toString());
        StringBuilder sb = new StringBuilder();
        sb = sb.append("SELECT * from students where 1=1");
        for (Map.Entry<String, String> entry : data.entrySet()) {
            if (!entry.getValue().substring(1, entry.getValue().length() - 1).equals("null")) {
                String addedText = " AND " + entry.getKey() + " = " + entry.getValue();
                sb = sb.append(addedText);
            }
        }
        System.out.println(sb.toString());
    }


    public static Map loadData() throws Exception {
        try {
            Map<String, String> map = new HashMap<String, String>();
            BufferedReader in = new BufferedReader(new FileReader("HomeWorks/Homeworks002/task1.json"));
            String line = "";
            while ((line = in.readLine()) != null) {
                String[] keyValuePair = line.substring(1, line.length() - 1).replaceAll("\\s+","").split("[,:]");
                for (int i = 1; i < keyValuePair.length; i+=2) {
                    map.put(keyValuePair[i-1], keyValuePair[i]);                
                }
            }
            in.close();
            return map;        

        } finally {
        }
    }
}
