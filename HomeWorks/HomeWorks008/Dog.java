package HomeWorks.HomeWorks008;

public class Dog extends Pet{
    private boolean trained;
    
    public Dog(int height, int weight, String eyeСolor, String name, String breed, String vaccine, String coatColor,
                String birthDate, boolean trained) {
        super(height, weight, eyeСolor, name, breed, vaccine, coatColor, birthDate);
        this.trained = trained;
    }
    @Override
    public void makeSound() {
        System.out.println("Собака говорит: Гав");
    }
    @Override
    public String animalInfo() {
        return String.format("%s\nДрессирован: %b",
        super.animalInfo(), this.trained);
    }
    public void goTrained() {
        System.out.println("Собака была надрессированна!");
        this.trained = true;        
    }
}
