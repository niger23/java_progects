from Core.Models.Rectangle import Rectangle


class Square(Rectangle):
    def __init__(self, length):
        super().__init__(length, length)
