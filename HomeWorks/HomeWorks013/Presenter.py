from FigureBook import FigureBook
from ConsoleView import ConsoleView
from Circle import Circle
from Rectangle import Rectangle
from Square import Square
from Triangle import Triangle

class Presenter:
    def __init__(self, view):
        self.view = ConsoleView()
        self.model = FigureBook()

    def add(self):
        while True:
            num = int(self.view.down_menu())
            if num == 1:
                self.model.add(Square(self.view.input_side()))
                break
            elif num == 2:
                self.model.add(Rectangle(self.view.input_side(),self.view.input_side()))
                break
            elif num == 3:
                self.model.add(Triangle(self.view.input_side(),self.view.input_side(),self.view.input_side()))
                break
            elif num == 4:
                self.model.add(Circle(self.view.input_radius()))
                break
            else:
                self.view.bad_input()
                continue

    def remove(self):
        num = int(self.view.get_choise())
        self.model.remove(num)
    
    def figures_info(self):
        self.model.figures_info()