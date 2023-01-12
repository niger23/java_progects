package Seminars.Seminar006;

import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "Барсик";
        cat1.color = "серый";
        cat1.owner = "БорСП";
        cat1.age = 12;
        cat1.diagnosis = "здоров";
        cat1.id = 1;

        Cat cat2 = new Cat();
        cat2.name = "Мурзик";
        cat2.color = "белый";
        cat2.owner = "ВорСК";
        cat2.age = 1;
        cat2.diagnosis = "здоров";
        cat1.id = 2;

        Cat cat3 = new Cat();
        cat3.name = "Белка";
        cat3.color = "чёрный";
        cat3.owner = "ЛорКУ";
        cat3.age = 7;
        cat3.diagnosis = "диагностика";
        cat3.id = 3;

        Cat cat4 = new Cat();
        cat4.name = "Белка";
        cat4.color = "чёрный";
        cat4.owner = "ЛорКУ";
        cat4.age = 7;
        cat4.diagnosis = "диагностика";
        cat4.id = 3;

        Set<Cat> cat = new HashSet<Cat>();
        cat.add(cat1); cat.add(cat2); cat.add(cat3); cat.add(cat4);

        for(Cat c : cat) {
            System.out.println(c);
        }
    }
}
