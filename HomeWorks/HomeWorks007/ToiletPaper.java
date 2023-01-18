package HomeWorks.HomeWorks007;

public class ToiletPaper extends HygieneItems{
    private int layers;

    public ToiletPaper(String name, int price, int quantity, String unit, int pieces, int layers) {
        super(name, price, quantity, unit, pieces);
        this.layers = layers;
    }
    @Override
    public String toString() {
        return String.format("%s\nКоличество слоёв: %d", super.toString(),layers);
    }
}
