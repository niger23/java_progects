package HomeWorks.HomeWorks007;

public class ChildProducts extends Products{
    private int minAge;
    private boolean hypoallergenic;


    public ChildProducts(String name, int price, int quantity, String unit, int minAge, boolean hypoallergenic) {
        super(name, price, quantity, unit);
        this.minAge = minAge;
        this.hypoallergenic = hypoallergenic;
    }
    @Override
    public String toString() {
        return String.format("%s\nМинимальный возраст: %d\nГипоалергенный: %b", super.toString(),minAge,hypoallergenic);
    }
}
