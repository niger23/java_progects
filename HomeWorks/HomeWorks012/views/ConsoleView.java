package HomeWorks.HomeWorks012.views;

import java.util.List;

import HomeWorks.HomeWorks012.interfaces.Flyer;
import HomeWorks.HomeWorks012.interfaces.Trainer;
import HomeWorks.HomeWorks012.models.Animal;



public class ConsoleView implements View {


    public ConsoleView() {

    }
    public void Menu() {
        System.out.print("\n1. Добавить животное\n2. Удалить животное\n3. Посмотреть информацию о животном\n4. Издать звук животному\n5. Посмотреть информацию о всех животных\n6. Издать звук всем животным\n7. Выход\nВыбери пункт: ");
    }
    public void BadIndex() {
        System.out.println("Нет такого значения");
    }
    @Override
    public void ChoiseAnimalMsg() {
        System.out.print("\nВведите порядковый номер животного: ");
    }
    @Override
    public void ChoiseAddAnimalMsg() {
        System.out.print("\nКакое животное добавляем:\n1 - Кошка\n2 - Собака\n3 - Тигр\n4 - Волк\n5 - Курица\n6 - Аист\nВведите номер: ");
    }
    @Override
    public void PrintAnimal(Animal animal) {
        System.out.printf("%s\n%s\n\n", animal.getClass().getSimpleName(), animal);
        
    }
    public void PrintAnimals(List<Animal> animals) {
        for (int i = 0; i < animals.size(); i++) {
            System.out.printf("\n%d - %s\n%s\n", i, animals.get(i).getClass().getSimpleName(), animals.get(i));
        }
        System.out.println();
        
    }
    public void SoundAnimal(Animal animal) {
        System.out.printf("Животное %s говорит: %s\n\n", animal.getClass().getSimpleName(), animal.makeSound());
        
    }
    public void SoundAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            SoundAnimal(animal);
        }
        
    }
    public void FlyAnimal(Animal animal) {
        if (animal instanceof Flyer) {
            System.out.println(((Flyer) animal).fly());
        }
        
    }
    public void TrainAnimal(Animal animal) {
        if (animal instanceof Trainer) {
            System.out.println(((Trainer) animal).goTrained());
        }
        
    }
    @Override
    public void ChoiseAnimal1Msg() {
        System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Кличка Порода Прививки Окрас Дата_рождения Наличие_шерсти(true/false)\n");
    }
    @Override
    public void ChoiseAnimal2Msg() {
        System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Кличка Порода Прививки Окрас Дата_рождения Дрессирован(true/false)\n");
    }
    @Override
    public void ChoiseAnimal3Msg() {
        System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Среда_обитания Дата_Нахождения\n");
    }
    @Override
    public void ChoiseAnimal4Msg() {
        System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Среда_обитания Дата_Нахождения Вожак(true/false)\n");   
    }
    @Override
    public void ChoiseAnimal5Msg() {
        System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Высота_полёта\n");  
    }
    @Override
    public void ChoiseAnimal6Msg() {
        System.out.print("Введите через пробел:\n Рост Вес Цвет_глаз Высота_полёта\n");
    }
}
