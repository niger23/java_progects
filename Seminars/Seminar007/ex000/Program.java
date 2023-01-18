package Seminars.Seminar007.ex000;

public class Program {
    private static void printAnimalInfo(Animal animal) {
        System.out.println(String.format("%s", animal.toString()));
        animal.makeSound();
    }
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal cat = new Cat();
        Animal dog = new Dog();
        Animal[] animals = new Animal[] {animal,cat,dog};

        for(Animal elem : animals) {
            printAnimalInfo(elem);
        }
    }
}
