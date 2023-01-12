package HomeWorks.HomeWorks006;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class task {
    public static void main(String[] args) {
        Laptop nb1 = new Laptop();
        nb1.name = "Lenovo";
        nb1.ram = 16;
        nb1.hdd = 512;
        nb1.os = "Windows";
        nb1.colour = "grey";
        nb1.screan = 15.6;

        Laptop nb2 = new Laptop();
        nb2.name = "Asus";
        nb2.ram = 8;
        nb2.hdd = 256;
        nb2.os = "Windows";
        nb2.colour = "green";
        nb2.screan = 15.6;

        Laptop nb3 = new Laptop();
        nb3.name = "Dell";
        nb3.ram = 4;
        nb3.hdd = 256;
        nb3.os = "none";
        nb3.colour = "black";
        nb3.screan = 17;

        Laptop nb4 = new Laptop();
        nb4.name = "Asus";
        nb4.ram = 8;
        nb4.hdd = 512;
        nb4.os = "Linux";
        nb4.colour = "black";
        nb4.screan = 15.6;

        Laptop nb5 = new Laptop();
        nb5.name = "Lenovo";
        nb5.ram = 8;
        nb5.hdd = 512;
        nb5.os = "Linux";
        nb5.colour = "white";
        nb5.screan = 17;


        Set<Laptop> laptops = new HashSet<Laptop>(List.of(nb1, nb2,nb3,nb4,nb5));
        
        Map<String, String> sel = userInter(laptops);
        filterNot(sel, laptops);
    }

    public static Map<String, String> userInter(Set<Laptop> laptops) {
        Map<String, String> res = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите: \nprint - чтобы вывести весь список;\nselect - чтобы подобрать конкретный ноутбук\nend - для выхода");
            String quest = scanner.nextLine();
            if (quest.equals("end")) {
                break;
            } else if (quest.equals("select")) {
                System.out.println("Выберите критерий поиска: \n 1 - Марка \n 2 - RAM \n 3 - HDD \n 4 - OS \n 5 - Цвет");
                String key = scanner.nextLine();
                System.out.println("Введите максимальное значение: ");
                String value = scanner.nextLine();
  
                res.put(key, value);
                scanner.close();
                break;
            } else if (quest.equals("print")) {
                System.out.println();
                for (Laptop l : laptops) {
                    System.out.println(l);
                }
            }
        }
        scanner.close();
        return res;
    }

    public static void filterNot(Map<String, String> criterias, Set<Laptop> laptops) {

        Set<Laptop> temp = new HashSet<>();
        for (Laptop laptop : laptops) {
  
            for (Object pair : criterias.keySet()) {
                if (pair.equals("1") && laptop.getName().equals(criterias.get(pair))) {
                    temp.add(laptop);
                } else if (pair.equals("2") && (laptop.getRam() <= Integer.parseInt(criterias.get(pair)))) {
                    temp.add(laptop);
                } else if (pair.equals("3") && (laptop.getHdd() <= Integer.parseInt(criterias.get(pair)))) {
                    temp.add(laptop);
                } else if (pair.equals("4") && laptop.getOS().equals(criterias.get(pair))) {
                    temp.add(laptop);
                } else if (pair.equals("5") && laptop.getColour().equals(criterias.get(pair))) {
                    temp.add(laptop);
                }
                
            }
        }
        if (temp.isEmpty()) {
        System.out.println("Ничего не удалось найти!");
        } else {
            System.out.println("Фильтрация по выбранному критерию: ");
            for (Laptop t : temp) {
                System.out.println(t);
            }
        }
    }
}
