package HomeWorks.HomeWorks012.models;

public abstract class Animal {
    private int height;
    private int weight;
    private String eyeСolor;

    public Animal(int height,int weight,String eyeСolor) {
        this.height = height;
        this.weight = weight;
        this.eyeСolor = eyeСolor;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getEyeСolor() {
        return this.eyeСolor;
    }

    public abstract String makeSound();

    @Override
    public String toString() {
        return String.format("Рост: %d\nВес:: %d\nЦвет глаз: %s",
        this.getHeight(), this.getWeight(), this.getEyeСolor());
    }
}
