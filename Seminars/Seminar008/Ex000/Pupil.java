package Seminars.Seminar008.Ex000;

public abstract class Pupil {
    private String fullName;
    private double averBall;
    private int classNumber;

    public Pupil(String fullName, double averBall, int classNumber) {
        this.fullName = fullName;
        this.averBall = averBall;
        this.classNumber = classNumber;
    }
    public void play() {
        System.out.println("Я играю");
    }
    public void learn() {
        System.out.println("Я учусь");
    }
    @Override
    public String toString() {
        return String.format("Имя: %s\nСредний балл: %.2f\nНомер класса: %d",
         this.fullName, this.averBall, this.classNumber);
    }
}
