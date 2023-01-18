package Seminars.Seminar007.ex001;

public class Bike extends Transports {
    public Bike () {
        super.level = 3;
        this.weight = Bike.r.nextInt(250);
        this.wheels = 2;
        this.speed = Bike.r.nextInt(160);
    }

    public String goMove(int time) {
        return String.format("Мотоцикл %s", super.goMove(time));
    }
}
