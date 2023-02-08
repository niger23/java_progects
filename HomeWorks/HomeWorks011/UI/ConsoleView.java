package HomeWorks.HomeWorks011.UI;

import java.util.Scanner;

import HomeWorks.HomeWorks011.Core.Infrastructure.PhoneBook;
import HomeWorks.HomeWorks011.Core.MVP.ViewModel;
import HomeWorks.HomeWorks011.Core.Models.Contact;

public class ConsoleView implements ViewModel {
    Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mainMenu() {
        System.out.println("""
                1. Все контакты
                2. Добавить
                3. Удалить
                4. Найти
                5. Изменить
                6. Загрузить
                7. Сохранить
                8. Выход
                """);
    }

    public void updateContactMenu() {
        System.out.println("""
                Выберите:
                1. Имя
                2. Номер
                3. E'mail
                """);
    }


    public void importExportMenu() {
        System.out.println("""
                В какой формате:
                1. CSV
                2. JSON
                """);
    }

    public int getChoice() {
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public int getChoice(String custom) {
        System.out.printf("Введите %s: \n", custom);
        int result = scanner.nextInt();
        scanner.nextLine();
        return result;
    }

    public String getContactName() {
        System.out.printf("Имя: ");
        return scanner.nextLine();
    }

    public String getContactName(String custom) {
        System.out.printf("Введите %s имя: \n", custom);
        return scanner.nextLine();
    }

    public String getPhoneNumber() {
        System.out.printf("Номер: ");
        return scanner.nextLine();
    }

    public String getEmail() {
        System.out.printf("E'mail: ");
        return scanner.nextLine();
    }

    public void showContact(Contact contact) {
        System.out.println(contact);
    }

    public void showBook(PhoneBook book) {
        int count = 1;
        for (Contact contact : book.getBook().values()) {
            System.out.printf("%d. ", count++);
            System.out.println(contact);
            System.out.println();
        }
    }

    public void print(String information) {
        System.out.println(information);
    }

    @Override
    public void bye() {
        scanner.close();
    }
}
