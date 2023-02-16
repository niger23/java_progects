package HomeWorks.HomeWorks012.views;

import java.util.List;
import HomeWorks.HomeWorks012.models.Animal;

public interface AppAnimals {
    public void PrintAnimal(Animal animal);

    public void PrintAnimals(List<Animal> animals);

    public void SoundAnimal(Animal animal);

    public void SoundAnimals(List<Animal> animals);

    public void FlyAnimal(Animal animal);

    public void TrainAnimal(Animal animal);
}
