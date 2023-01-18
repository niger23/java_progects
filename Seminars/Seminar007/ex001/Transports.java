package Seminars.Seminar007.ex001;

import java.util.Random;

public class Transports {
    protected String transName;
    protected String color;
    protected String model;
    protected int wheels;
    protected int weight;
    protected int speed;
    protected int level;
    protected static Random r;

    static {
        Transports.r = new Random();
    }


    public String transInfo() {
        return String.format("Наименование: %s\nЦвет: %s\nМодель: %s\nКолёс: %d\nВес: %d\nСкорость: %d\nУровень: %d",
        this.getClass().getSimpleName(),this.color,this.model,this.wheels,this.weight,this.speed, this.level);
    }
    public String goMove(int time) {
        return String.format("проехал %d километров", speed*time);
    }
}
