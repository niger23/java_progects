package HomeWorks.HomeWorks007;

public class Bread extends Foods{
    private String typeFlour;

    public Bread(String name, int price, int quantity, String unit, String expirationDate, String typeFlour) {
        super(name, price, quantity, unit, expirationDate);
        this.typeFlour = typeFlour;
    }
    @Override
    public String toString() {
        return String.format("%s\nТип муки: %s", super.toString(),typeFlour);
    }
    
}
