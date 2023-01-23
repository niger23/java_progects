package HomeWorks.HomeWorks008;

public class Wolf extends WildAnimal {
    private boolean leader;

    public Wolf(int height, int weight, String eyeСolor, String habitat, String dateFound, boolean leader) {
        super(height, weight, eyeСolor, habitat, dateFound);
        this.leader = leader;
    }

    public void makeSound() {
        System.out.println("Волк говорит: Ууу-уу");
    }

    @Override
    public String animalInfo() {
        return String.format("%s\nВожак стаи: %b",
                super.animalInfo(), this.leader);
    }
}
