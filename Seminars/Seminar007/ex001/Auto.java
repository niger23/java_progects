package Seminars.Seminar007.ex001;

public class Auto extends Transports {
    public Auto () {
        this.transName = "Автомобиль";
        this.level = 2;
        this.weight = Auto.r.nextInt(2500);
        this.wheels = 4;
        this.speed = Auto.r.nextInt(120);
    }

    public String goMove(int time) {
        return String.format("%s %s", transName, super.goMove(time));
    }
}
