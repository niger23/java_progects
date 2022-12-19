// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package Seminars.Seminar003;

import java.util.ArrayList;
import java.util.*;

public class task2 {
    public static void main(String[] args) {
        ArrayList <Integer> randomNum = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // Random random = new Random();
            // randomNum.add(random.nextInt(99));
            randomNum.add(new Random().nextInt(100));
        }
        System.out.println(randomNum.toString());
 
        // randomNum.sort(Comparator.naturalOrder());
        Collections.sort(randomNum);
        // randomNum.sort(null);
        System.out.println(randomNum);

    }
    
}
