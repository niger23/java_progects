package HomeWorks.HomeWorks007;

public class Products {
    private String name;
    private int price;
    private int quantity;
    private String unit;

    public Products(String name, int price, int quantity, String unit) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }
    @Override
    public String toString() {
        return String.format("Название: %s\nЦена: %d\nКоличество: %d\nЕдиница измерения: %s",
         this.name, this.price, this.quantity, this.unit);
    }

}

