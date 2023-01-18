package HomeWorks.HomeWorks007;

public class Drinks extends Products{
    private double volume;

    public Drinks(String name, int price, int quantity, String unit, double volume) {
        super(name, price, quantity, unit);
        this.volume = volume;
    }
    @Override
    public String toString() {
        return String.format("%s\nОбъём: %.2f", super.toString(),volume);
    }
}
    
