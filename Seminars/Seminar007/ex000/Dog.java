package Seminars.Seminar007.ex000;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Wouw");
    }
    @Override
    public String toString() {
        return "Dog";
    }
}
