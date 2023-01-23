package HomeWorks.HomeWorks008;

public abstract class Animal {
    private int height;
    private int weight;
    private String eyeСolor;

    public Animal(int height,int weight,String eyeСolor) {
        this.height = height;
        this.weight = weight;
        this.eyeСolor = eyeСolor;
    }

    public abstract void makeSound();

    
    public String animalInfo() {
        return String.format("Рост: %d\nВес:: %d\nЦвет глаз: %s",
        this.height, this.weight, this.eyeСolor);
    }
}
