package HomeWorks.HomeWorks008;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Cat animal1 = new Cat(30, 5, "Серый", "Пушок", "Дворняга", "нету", "Серый", "апрель 2020", true);
        Dog animal2 = new Dog(55, 15, "Карие", "Шарик", "Дворовая", "12.12.12", "Рыжий", "апрель 2021", false);
        Tiger animal3 = new Tiger(80, 230, "Карие", "Леса", "00.00.00");
        Wolf animal4 = new Wolf(70, 90, "Голубой", "Тайга", "01.01.00", true);
        Checken animal5 = new Checken(25, 2, "Чёрный", 10);
        Stork animal6 = new Stork(70, 8, "Черный", 500);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(animal1); animalList.add(animal2); animalList.add(animal3);
        animalList.add(animal4); animalList.add(animal5); animalList.add(animal6);
        boolean flag = true;
        while (flag == true) {
            Scanner iScanner = new Scanner(System.in);
            System.out.print(
                    "\n1. Добавить животное\n2. Удалить животное\n3. Посмотреть информацию о животном\n4. Издать звук животному\n5. Посмотреть информацию о всех животных\n6. Издать звук всем животным\n7. Выход\nВыбери пункт: ");
            int menu = iScanner.nextInt();
            if (menu == 1) addAnimal(animalList);
            else if (menu == 2) deleteAnimal(animalList);
            else if (menu == 3) showAnimal(animalList);
            else if (menu == 4) soundAnimal(animalList);
            else if (menu == 5) showAll(animalList);
            else if (menu == 6) soundAll(animalList);
            else flag = false;
            // iScanner.close();
        }
    }

    public static int getAnimal(ArrayList<Animal> list) {
        System.out.print("\nВведите порядковый номер животного: ");
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        if (!(num >= list.size()) && !(num < 0)) {
            return num;
        } else {
            System.out.println("Такого животного нету...");
            return 0;
        }
        

    }

    public static void deleteAnimal(ArrayList<Animal> animalList) {
        animalList.remove(getAnimal(animalList));
    }
    public static void showAnimal(ArrayList<Animal> animalList) {
        System.out.println(animalList.get(getAnimal(animalList)).animalInfo());
    }
    public static void soundAnimal(ArrayList<Animal> animalList) {
        animalList.get(getAnimal(animalList)).makeSound();
    }
    public static void showAll(ArrayList<Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).animalInfo());
            System.out.println();
        }
    }
    public static void soundAll(ArrayList<Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            animalList.get(i).makeSound();
            System.out.println();
        }
    }
    public static void addAnimal(ArrayList <Animal> animalList) {
                System.out.print("\nКакое животное добавляем:\n1 - Кошка\n2 - Собака\n3 - Тигр\n4 - Волк\n5 - Курица\n6 - Аист\nВведите номер: ");
                Scanner iScanner = new Scanner(System.in);
                int choiseAnimal = iScanner.nextInt();
                
                iScanner = new Scanner(System.in);
                String[] result;
                if (choiseAnimal == 1) {
                    System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Кличка Порода Прививки Окрас Дата_рождения Наличие_шерсти(true/false)\n");
                    result = iScanner.nextLine().split(" ");

                    Animal cat = new Cat(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4], result[5], result[6], result[7], Boolean.parseBoolean(result[8]));
                    animalList.add(cat);
                }
                else if (choiseAnimal == 2) {
                    System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Кличка Порода Прививки Окрас Дата_рождения Дрессирован(true/false)\n");
                    result = iScanner.nextLine().split(" ");

                    Animal dog = new Dog(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4], result[5], result[6], result[7], Boolean.parseBoolean(result[8]));
                    animalList.add(dog);
                }
                else if (choiseAnimal == 3) {
                    System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Среда_обитания Дата_Нахождения\n");
                    result = iScanner.nextLine().split(" ");

                    Animal tigr = new Tiger(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4]);
                    animalList.add(tigr);
                }
        
                else if (choiseAnimal == 4) {
                    System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Среда_обитания Дата_Нахождения Вожак(true/false)\n");
                    result = iScanner.nextLine().split(" ");

                    Animal wolf = new Wolf(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], result[3], result[4], Boolean.parseBoolean(result[5]));
                    animalList.add(wolf);
                }
        
                else if (choiseAnimal == 5) {
                    System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Высота_полёта\n");
                    result = iScanner.nextLine().split(" ");

                    Animal chicken = new Checken(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], Integer.parseInt(result[3]));
                    animalList.add(chicken);
                }
        
                else if (choiseAnimal == 6) {
                    System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Высота_полёта\n");
                    result = iScanner.nextLine().split(" ");

                    Animal stork = new Stork(Integer.parseInt(result[0]), Integer.parseInt(result[1]), result[2], Integer.parseInt(result[3]));
                    animalList.add(stork);
                }
                else {
                    System.out.println("Нет такого животного");
                }

            }

}
