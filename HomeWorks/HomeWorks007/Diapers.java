package HomeWorks.HomeWorks007;

public class Diapers extends ChildProducts{
    private String size;
    private int minWieght;
    private int maxWieght;
    private String type;

    public Diapers(String name, int price, int quantity, String unit, int minAge, 
                    boolean hypoallergenic, String size, int minWieght, int maxWieght, String type) {
        super(name, price, quantity, unit,minAge, hypoallergenic);
        this.size = size;
        this.minWieght = minWieght;
        this.maxWieght = maxWieght;
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("%s\nРазмер: %s\nМинимальный вес: %d\nМаксимальный вес: %d\nТип: %s", 
        super.toString(),size, minWieght,maxWieght,type);
    }
}
    

