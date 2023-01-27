package HomeWorks.HomeWorks009;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        
        Square item1 = new Square(2.0);
        Rectangle item2 = new Rectangle(1.0,2.0);
        Triangle item3 = new Triangle(2.0,3.0,4.0);
        Circle item4 = new Circle(3.0);

        ArrayList<Figure> items = new ArrayList<>();
        items.add(item1); items.add(item2);
        items.add(item3); items.add(item4);

        CollectFigure newCollect = new CollectFigure(items);



        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("1. Добавить новую фигуру\n2. Вывести информацию по всем фигурам\n3. Удалить фигуру\n4. Изменить фигуру\n5. Сортировка по площади\n6. Выход\nВведите пункт");
            int menu = getInput(scan);
            if (menu == 1) addFigure(newCollect,createFigure());
            else if (menu == 2) infoAllFigure(newCollect);
            else if (menu == 3) {
                System.out.println("Введите номер фигуры для удаления");
                deleteFigure(newCollect, getInput(scan));
            }
            else if (menu == 4) {
                System.out.println("Введите номер фигуры для замены");
                returnFigure(newCollect, getInput(scan));
            }
            else if (menu == 5) {
                System.out.println("Где-то тут потеряно 2 часа и без результата");
            }
            else if (menu == 6) break;
            else break;
        }
        scan.close();
        

    }
    public void name() {
        
    }

    public static int getInput(Scanner scan) {
        while (true) {
            if (scan.hasNextInt()) {
                return scan.nextInt();
            }
            scan.next();
        }
    }
    public static String getString(Scanner scan) {
        while (true) {
            if (scan.hasNextLine()) {
                return scan.nextLine();
            }
            scan.nextLine();
        }
    }
    public static void infoAllFigure(CollectFigure newCollect) {
        newCollect.figuresInfo();
    }
    public static void deleteFigure(CollectFigure newCollect, int num) {
        newCollect.deleteFigureCollect(num);
    }
    public static void returnFigure(CollectFigure newCollect, int num) {
        newCollect.returnFigureCollect(createFigure(),num);
    }
    
    public static void addFigure(CollectFigure newCollect, Figure item) {
        newCollect.addFigureCollect(item);
    }
    public static Figure createFigure() {
        System.out.println("Какую фигуру добавляем:\n1 - квадрат\n2 - прямоугольник\n3 - треугольник\n4 - круг\nВведите число:");
        Scanner scan = new Scanner(System.in);
        int choise = getInput(scan);
        String[] result;
        Scanner iScanner = new Scanner(System.in);
        if (choise == 1) {
            System.out.println("Введите сторону квадрата: ");
            result = getString(iScanner).split(" ");
            return new Square(Double.parseDouble(result[0]));
        } else if (choise == 2) {
            System.out.println("Введите две стороны прямоугольника через пробел: ");
            result = getString(iScanner).split(" ");
            return new Rectangle(Double.parseDouble(result[0]),Double.parseDouble(result[1]));
        } else if (choise == 3) {
            System.out.println("Введите три стороны треугольника через пробел: ");
            result = getString(iScanner).split(" ");
            return new Triangle(Double.parseDouble(result[0]),Double.parseDouble(result[1]),Double.parseDouble(result[2]));
        } else if (choise == 4) {
            System.out.println("Введите радиус круга: ");
            result = getString(iScanner).split(" ");
            return new Circle(Double.parseDouble(result[0]));
        } else {
            System.out.println("Нет такой фигуры, поэтому создадим квадратик");
            iScanner.close();
            return new Square(1.0);
        }
    }
}
