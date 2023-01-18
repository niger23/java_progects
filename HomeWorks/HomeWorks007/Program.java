package HomeWorks.HomeWorks007;

public class Program {
    public static void main(String[] args) {
        Products item1 = new Milk("Молоко Домик в селе", 100, 1, "литр", 1.1, 13.43, "12/12/12");
        Products item2 = new Lemonade("Буратино лимонад", 35, 4, "литр", 1.5);
        Products item3 = new Bread("Бородинский", 40, 1, "штуки", "12/12/12", "цельнозерновая");
        Products item4 = new Egg("Яйцо Беловское", 80, 2, "упаковка", "12/12/12", 10);
        Products item5 = new Masks("Маска медицинская", 150, 1, "упаковка", 50);
        Products item6 = new ToiletPaper("Zewat", 100, 1, "упаковка", 8, 3);
        Products item7 = new Diapers("Хангиз", 1000, 1, "упаковка", 3, true, "L", 3, 10, "Шорты");
        Products item8 = new Pacifier("Пустышка - ромашка", 210, 1, "штука", 2, true);

        Products[] products = new Products[] { item1, item2, item3, item4, item5, item6, item7, item8 };

        productInfo(products);
    }

    public static void productInfo(Products[] products) {
        for (Products product : products) {
            System.out.println(product);
            System.out.println();
        }
    }
}
