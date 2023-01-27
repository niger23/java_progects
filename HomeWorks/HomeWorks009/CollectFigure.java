package HomeWorks.HomeWorks009;

import java.util.ArrayList;
import java.util.List;

public class CollectFigure{
private List<Figure> figures;

    public CollectFigure(ArrayList<Figure> newList) {
        this.figures = new ArrayList<Figure>();
        for (Figure figure : newList) {
            figures.add(figure);
        }
        // this.figures = new ArrayList<Figure>(newList);
    }
    public void figuresInfo() {
        
        for (int index = 0; index < this.figures.size(); index++) {
            System.out.printf("Номер фигуры: %d\n", index);
            System.out.printf("Тип: %s\n",figures.get(index).getClass().getSimpleName());
            if (figures.get(index) instanceof Perimetr) System.out.printf("Периметр: %.2f\n",((Polygon)(figures.get(index))).perimeter());
            else if (figures.get(index) instanceof Circumference) System.out.printf("Длина окружности: %.2f\n",((Circle)(figures.get(index))).circumference());
            System.out.printf("Площадь: %.2f\n",figures.get(index).area());
            System.out.println();

        }
    }
    public void addFigureCollect(Figure item) {
        figures.add(item);
    }
    public void deleteFigureCollect(int num) {
        figures.remove(num);
    }
    public void returnFigureCollect(Figure item, int num) {
        figures.remove(num);
        figures.add(num, item);
    }
    public List<Figure> getFigures() {
        return this.figures;
    }
    public void sort () {
        // Collections.sort(this.figures);
    }
}
