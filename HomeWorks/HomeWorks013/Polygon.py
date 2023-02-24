from abc import ABC
from Figure import Figure


class Polygon(Figure, ABC):
    def __init__(self, sides: list):
        if all(sides) > 0:
            self.sides = sides
        else:
            raise ValueError("Invalid sides")

    def perimeter(self):
        return sum(self.sides)
