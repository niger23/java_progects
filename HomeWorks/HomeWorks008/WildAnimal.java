package HomeWorks.HomeWorks008;

public abstract class WildAnimal extends Animal{
    private String habitat;
    private String dateFound;

    public WildAnimal(int height, int weight, String eyeСolor,String habitat,String dateFound) {
        super(height, weight, eyeСolor);
        this.habitat = habitat;
        this.dateFound = dateFound;
    }
    @Override
    public String animalInfo() {
        return String.format("%s\nСреда обитания: %s\nДата нахождения: %s",
        super.animalInfo(), this.habitat, this.dateFound);
    }

}
