package HomeWorks.HomeWorks007;

public class Foods extends Products{
    private String expirationDate;

    public Foods(String name, int price, int quantity, String unit, String expirationDate) {
        super(name, price, quantity, unit);
        this.expirationDate = expirationDate;
    }
    @Override
    public String toString() {
        return String.format("%s\nСрок годности: %s", super.toString(),expirationDate);
    }
}
