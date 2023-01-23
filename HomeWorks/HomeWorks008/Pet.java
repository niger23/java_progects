package HomeWorks.HomeWorks008;

public abstract class Pet extends Animal {
    private String name;
    private String breed;
    private String vaccine;
    private String coatColor;
    private String birthDate;

    public Pet(int height, int weight, String eyeСolor, String name, String breed, String vaccine, String coatColor,
            String birthDate) {
        super(height, weight, eyeСolor);
        this.name = name;
        this.breed = breed;
        this.vaccine = vaccine;
        this.coatColor = coatColor;
        this.birthDate = birthDate;
    }
    public void showAffection() {
        //
    }
    @Override
    public String animalInfo() {
        return String.format("%s\nКличка: %s\nПорода: %s\nПрививки: %s\nЦвет шерсти: %s\nДата рождения: %s",
        super.animalInfo(), this.name, this.breed, this.vaccine, this.coatColor, this.birthDate);
    }
}
