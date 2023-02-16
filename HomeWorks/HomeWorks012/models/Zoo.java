package HomeWorks.HomeWorks012.models;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(List<Animal> animals) {
        this.animals = animals;
    }
    public Zoo() {
        Cat animal1 = new Cat(30, 5, "Серый", "Пушок", "Дворняга", "нету", "Серый", "апрель 2020", true);
        Dog animal2 = new Dog(55, 15, "Карие", "Шарик", "Дворовая", "12.12.12", "Рыжий", "апрель 2021", false);
        Tiger animal3 = new Tiger(80, 230, "Карие", "Леса", "00.00.00");
        Wolf animal4 = new Wolf(70, 90, "Голубой", "Тайга", "01.01.00", true);
        Checken animal5 = new Checken(25, 2, "Чёрный", 10);
        Stork animal6 = new Stork(70, 8, "Черный", 500);

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(animal1); animals.add(animal2); animals.add(animal3);
        animals.add(animal4); animals.add(animal5); animals.add(animal6);

        this.animals = animals;
    }
    public List<Animal> getAnimals() {
        return this.animals;
    }

    public Animal getAnimal(int index) {
        return this.animals.get(index);
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void removeAnimal(int index) {
        this.animals.remove(index);
    }
}
