class ConsoleView():
    def __init__(self):
        self.inp = input

    def get_choise(self):
        return int(self.inp("Введите номер фигуры: "))
    def main_menu(self):
        return self.inp("1. Добавить новую фигуру\n2. Вывести информацию по всем фигурам\n3. Удалить фигуру\n4. Выход\n")
    def down_menu(self):
        return self.inp("Какую фигуру добавляем:\n1 - квадрат\n2 - прямоугольник\n3 - треугольник\n4 - круг\n")
    def input_side(self):
        return int(self.inp("Введите сторону: "))
    def input_radius(self):
        return int(self.inp("Введите радиус: "))
    def bad_input(self):
        print("Нет такой команды")