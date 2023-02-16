package HomeWorks.HomeWorks012.models;

import HomeWorks.HomeWorks012.interfaces.Flyer;

public abstract class Bird extends Animal implements Flyer{
    private int flightAltitude;

    protected Bird(int height, int weight, String eyeСolor, int flightAltitude) {
        super(height, weight, eyeСolor);
        this.flightAltitude = flightAltitude;
    }
    @Override
    public String toString() {
        return String.format("%s\nВысота полёта: %d",
        super.toString(), this.flightAltitude);
    }
    public String fly() {
        return String.format("Я лечу на %d метрах", flightAltitude);
    };

    public int getFlightAltitude() {
        return flightAltitude;
    }
}
