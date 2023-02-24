from Figure import Figure
from Circle import Circle
from Rectangle import Rectangle
from Square import Square
from Triangle import Triangle

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

