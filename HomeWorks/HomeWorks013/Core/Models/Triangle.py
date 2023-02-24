from Core.Models.Polygon import Polygon


class Triangle(Polygon):
    def __init__(self, a, b, c):
        if a + b <= c or a + c <= b or b + c <= a:
            raise ValueError("Invalid triangle sides")
        super().__init__([a, b, c])

    def area(self):
        s = (self.sides[0] + self.sides[1] + self.sides[2]) / 2
        return (s * (s - self.sides[0]) * (s - self.sides[1]) * (s - self.sides[2])) ** 0.5
