package HomeWorks.HomeWorks012.models;

import HomeWorks.HomeWorks012.interfaces.Trainer;

public class Dog extends Pet implements Trainer{
    private boolean trained;
    
    public Dog(int height, int weight, String eyeСolor, String name, String breed, String vaccine, String coatColor,
                String birthDate, boolean trained) {
        super(height, weight, eyeСolor, name, breed, vaccine, coatColor, birthDate);
        this.trained = trained;
    }
    @Override
    public String makeSound() {
        return "Гав";
    }
    @Override
    public String toString() {
        return String.format("%s\nДрессирован: %b",
        super.toString(), this.trained);
    }
    public String goTrained() {
        this.trained = true;        
        return String.format("Собака была надрессированна!");
    }
}
