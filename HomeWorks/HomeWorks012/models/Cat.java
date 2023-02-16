package HomeWorks.HomeWorks012.models;

public class Cat extends Pet {
    private boolean wool;

    public Cat(int height, int weight, String eyeСolor, String name, String breed, String vaccine, String coatColor,
            String birthDate, boolean wool) {
        super(height, weight, eyeСolor, name, breed, vaccine, coatColor, birthDate);
        this.wool = wool;
    }
    @Override
    public String makeSound() {
        return "Мяу";
    }
    @Override
    public String toString() {
        return String.format("%s\nЕсть шерсть: %b",
        super.toString(), this.wool);
    }
}
