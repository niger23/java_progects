package HomeWorks.HomeWorks008;

public class Cat extends Pet {
    private boolean wool;

    public Cat(int height, int weight, String eyeСolor, String name, String breed, String vaccine, String coatColor,
            String birthDate, boolean wool) {
        super(height, weight, eyeСolor, name, breed, vaccine, coatColor, birthDate);
        this.wool = wool;
    }
    @Override
    public void makeSound() {
        System.out.println("Кошка говорит: Мяу");
    }
    @Override
    public String animalInfo() {
        return String.format("%s\nЕсть шерсть: %b",
        super.animalInfo(), this.wool);
    }
}
