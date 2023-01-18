package Seminars.Seminar007.ex001;

public class Truck extends Transports {
    public Truck () {
        super.level = 4;
        this.weight = Truck.r.nextInt(12500);
        this.wheels = 6;
        this.speed = Truck.r.nextInt(100);
    }

    public String goMove(int time) {
        return String.format("Грузовик %s", super.goMove(time));
    }
}
