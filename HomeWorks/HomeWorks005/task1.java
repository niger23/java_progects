// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

package HomeWorks.HomeWorks005;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        HashMap<String, List<String>> map = new HashMap<>();


        Scanner iScanner = new Scanner(System.in);
        System.out.println("Доступные команды:\nprint - показать список;\nstop - остановить приложение;");
        while (true) {
            System.out.printf("Введите команду или новую запись (имя номера, через пробел), \nлибо просто имя для поиска по справочнику: ");
            String[] m = iScanner.nextLine().split(" ");
            if (!m[0].equals("stop") && !m[0].equals("print")) {
                if (m.length > 1) {
                    if (map.get(m[0]) == null) {
                        map.put(m[0], new ArrayList<String>());
                      }
                    for (int i = 1; i < m.length; i++) {
                        map.get(m[0]).add(m[i]);
                    }
                } else {
                    System.out.printf("%s %s\n",m[0], map.get(m[0]));
                }
            } else if (m[0].equals("stop")) {
                System.out.println(map);
                break;
            } else if (m[0].equals("print")) {
                System.out.println(map);
            }
        }
        iScanner.close();
    }

}
