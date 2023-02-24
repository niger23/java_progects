from Core.Models.Figure import Figure
from Core.Models.Circle import Circle
from Core.Models.Rectangle import Rectangle
from Core.Models.Square import Square
from Core.Models.Triangle import Triangle

class FigureBook:
    def __init__(self):
        self.figures = []
        self.figures.append(Circle(5))
        self.figures.append(Rectangle(5, 10))
        self.figures.append(Square(10))
        self.figures.append(Triangle(3, 4, 5))

    def add(self, figure):
        self.figures.append(figure)

    def remove(self, num):
        self.figures.pop(num)

    def figures_info(self):
        print("======================")
        count = 0
        for figure in self.figures:
            print(f"Номер фигуры: {count}\nТип фигуры: {type(figure).__name__}\nПериметр: {figure.perimeter():.2f}\nПлощадь: {figure.area():.2f}\n")
            count+=1

