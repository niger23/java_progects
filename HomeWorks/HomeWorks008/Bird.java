package HomeWorks.HomeWorks008;

public abstract class Bird extends Animal{
    private int flightAltitude;

    public Bird(int height, int weight, String eyeСolor, int flightAltitude) {
        super(height, weight, eyeСolor);
        this.flightAltitude = flightAltitude;
    }
    @Override
    public String animalInfo() {
        return String.format("%s\nВысота полёта: %d",
        super.animalInfo(), this.flightAltitude);
    }
    public void fly() {
        System.out.printf("Я лечу на %d метрах", flightAltitude);
    };

    // public int getFlightAltitude() {
    //     return flightAltitude;
    // }
}
