package HomeWorks.HomeWorks010;

public class Program {
    public static void main(String[] args) {

        DiffList <Integer> newList = new DiffList<>();
        newList.add(30); newList.add(3034);
        newList.add(2); newList.add(2);
        newList.add(0); newList.add(130);
        System.out.println("Получится список:\n");
        newList.print();
        System.out.println("Сортируемся\n");
        // newList.BubbleSort();
        // newList.InsertionSort();
        newList.SelectionSort();

        newList.print();
        System.out.printf("Первый индекс 2: %d\n", newList.indexOf(2));
        System.out.printf("Есть ли 3034: %b\n", newList.contains(3034));
        System.out.println("Удаляем элемент 5\n");
        
        newList.remove(5);
        newList.print();

        System.out.println("Удаляем двойки\n");

        newList.removeAll(2);
        newList.print();

        System.out.printf("Минимальное значение: %d\n",newList.getMin());
        System.out.printf("Максимальное значение: %d\n",newList.getMax());

        System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||");

        DiffList <String> newList2 = new DiffList<>();
        newList2.add("Араби"); newList2.add("Арабик");
        newList2.add("Араб"); newList2.add("Ар");
        newList2.add("Ара"); newList2.add("Арабика");
        System.out.println("Получится список:\n");
        newList2.print();
        System.out.println("Сортируемся\n");
        // newList.BubbleSort();
        newList.InsertionSort();
        // newList2.SelectionSort();

        newList2.print();
        System.out.printf("Первый индекс Ара: %d\n", newList2.indexOf("Ара"));
        System.out.printf("Есть ли Бика: %b\n", newList2.contains("Бика"));
        System.out.println("Удаляем элемент 0");
        
        newList2.remove(0);
        newList2.print();

        System.out.println("Удаляем Арабика\n");

        newList2.removeAll("Арабика");
        newList2.print();

        System.out.printf("Минимальное значение: %s\n",newList2.getMin());
        System.out.printf("Максимальное значение: %s\n",newList2.getMax());


        System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||");

        DiffList <Cat> newList3 = new DiffList<>();
        newList3.add(new Cat("Барсик", 1)); newList3.add(new Cat("Мурзик", 2));
        newList3.add(new Cat("Рыжик", 3)); newList3.add(new Cat("Пушок", 4));
        newList3.add(new Cat("Матроскин", 5)); newList3.add(new Cat("Тефтелька", 6));
        System.out.println("Получится список:\n");
        newList3.print();
        System.out.println("Сортируемся\n");
        newList.BubbleSort();
        newList.InsertionSort();
        newList2.SelectionSort();

        newList3.print();
        System.out.printf("Первый индекс Ара: %d\n", newList3.indexOf(new Cat("Пушок", 4)));
        System.out.printf("Есть ли Бика: %b\n", newList3.contains(new Cat("Тефтелька", 1)));
        System.out.println("Удаляем элемент 0\n");
        
        newList3.remove(0);
        newList3.print();

        System.out.println("Удаляем Матроскина\n");

        newList3.removeAll(new Cat("Матроскин", 5));
        newList3.print();

        System.out.printf("Минимальное значение: %s\n",newList3.getMin());
        System.out.printf("Максимальное значение: %s\n",newList3.getMax());
    }
}
