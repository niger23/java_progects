// Пусть дан список сотрудников:Иван Иванов ( и остальные, полный текст дз будет на платформе)
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.

package HomeWorks.HomeWorks005;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        List<String> workers = List.of("Иван Иванов", "Пётр Петрович", "Сергей Сергеевич", "Иван Иванов", "Иван Иванов",
        "Пётр Петрович", "Сергей Сергеевич", "Иван Иванов", "Пётр Петрович", "Иван Иванов", "Пётр Петрович", "Иван Иванов", "Сергей Сергеевич",
        "Сергей Сергеевич", "Сергей Сергеевич", "Алексей Алексеевич");
        System.out.println(sorted(countName(workers)));
    }

    public static Map<String, Integer> countName(List<String> workers) {
        Map<String, Integer> nameCount = new LinkedHashMap<>();

        for (int i = 0; i < workers.size(); i++) {
            if (nameCount.containsKey(workers.get(i))) {
                nameCount.put(workers.get(i), nameCount.get(workers.get(i)) + 1);
            } else {
                nameCount.put(workers.get(i), 1);
            }
        }
        return nameCount;
    }
    public static Map<String, Integer> sorted(Map<String, Integer> countName) {     
        Map<String, Integer> sortedMap = countName.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortedMap;
    }
}
