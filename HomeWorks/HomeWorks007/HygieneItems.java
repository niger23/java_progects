package HomeWorks.HomeWorks007;

public class HygieneItems extends Products{
    private int pieces;

    public HygieneItems(String name, int price, int quantity, String unit, int pieces) {
        super(name, price, quantity, unit);
        this.pieces = pieces;
    }
    @Override
    public String toString() {
        return String.format("%s\nКоличество штук в упаковке: %d", super.toString(),pieces);
    }
    
}
