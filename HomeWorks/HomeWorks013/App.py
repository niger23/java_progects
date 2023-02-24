import os

from Presenter import Presenter
from ConsoleView import ConsoleView

class App:
    def clear_console(self):
        os.system('cls' if os.name == 'nt' else 'clear')

    def run(self):
        self.clear_console()
        view = ConsoleView()
        presenter = Presenter(view)

        while True:
            
            key = int(view.main_menu())
            self.clear_console()
            if key == 1:
                presenter.add()
            elif key == 2:
                presenter.figures_info()
            elif key == 3:
                presenter.remove()
            elif key == 4:
                return
            else:
                print("Нет такой команды")