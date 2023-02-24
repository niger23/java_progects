from Polygon import Polygon


class Rectangle(Polygon):

    def __init__(self, width, height):
        super().__init__([width, height, width, height])

    def area(self):
        return self.sides[0] * self.sides[1]
