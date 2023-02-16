package HomeWorks.HomeWorks012.models;

public class Wolf extends WildAnimal {
    private boolean leader;

    public Wolf(int height, int weight, String eyeСolor, String habitat, String dateFound, boolean leader) {
        super(height, weight, eyeСolor, habitat, dateFound);
        this.leader = leader;
    }

    public String makeSound() {
        return "Ууу-уу";
    }

    @Override
    public String toString() {
        return String.format("%s\nВожак стаи: %b",
                super.toString(), this.leader);
    }
}
