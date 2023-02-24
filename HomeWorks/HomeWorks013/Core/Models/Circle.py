from Core.Models.Figure import Figure
from math import pi


class Circle(Figure):

    def __init__(self, radius):
        if radius > 0:
            self.radius = radius
        else:
            raise ValueError("Invalid radius")

    def area(self):
        return pi * self.radius ** 2

    def circumference(self):
        return 2 * pi * self.radius

    def perimeter(self):
        return self.circumference()
