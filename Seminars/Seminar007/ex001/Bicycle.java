package Seminars.Seminar007.ex001;

public class Bicycle extends Transports {
    public Bicycle () {
        super.level = 5;
        this.weight = Bicycle.r.nextInt(25);
        this.wheels = 2;
        this.speed = Bicycle.r.nextInt(30);
    }

    public String goMove(int time) {
        return String.format("Велосипед %s", super.goMove(time));
    }
}
