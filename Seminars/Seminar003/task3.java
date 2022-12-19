package Seminars.Seminar003;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        ArrayList<String> planets = new ArrayList<>();
        String[] plan = new String[] {"Меркурий","Венера","Земля","Марс","Юпитер","Сатурн","Уран","Нептун","Плутон"};
        for (int i = 0; i < 15; i++) {
            planets.add(plan[new Random().nextInt(9)]);
        }
        System.out.println(planets);
        for (int i = 0; i < plan.length; i++) {
            int num = Collections.frequency(planets, plan[i]);
            System.out.printf("%s упоминается всего: %d\n",plan[i],num);   
        }
        for (int i = 0; i < plan.length; i++) {
            int count = 0;
            for (int j = 0; j < planets.size(); j++) {
                if (plan[i].equals(planets.get(j))) {
                    count++;
                    if (count > 1) {
                        planets.remove(j);
                        j--;
                    }
                }
                
            }
        }
        System.out.println(planets);
    }  
}
