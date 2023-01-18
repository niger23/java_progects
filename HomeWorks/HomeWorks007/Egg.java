package HomeWorks.HomeWorks007;

public class Egg extends Foods{
private int pieces;

    public Egg(String name, int price, int quantity, String unit, String expirationDate, int pieces) {
        super(name, price, quantity, unit, expirationDate);
        this.pieces = pieces;
    }
    @Override
    public String toString() {
        return String.format("%s\nКоличество в упаковке: %d", super.toString(),pieces);
    }
}
