package HomeWorks.HomeWorks007;

public class Milk extends Drinks{
    private double fatPercentage;
    private String expirationDate;

    public Milk(String name, int price, int quantity, String unit, double volume, double fatPercentage, String expirationDate) {
        super(name, price, quantity, unit, volume);
        this.fatPercentage = fatPercentage;
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return String.format("%s\nПроцент жирности: %.2f\nСрок годности: %s", super.toString(),fatPercentage, expirationDate);
    }
}
