package HomeWorks.HomeWorks011.Core.MVP;

import HomeWorks.HomeWorks011.Core.Infrastructure.PhoneBook;
import HomeWorks.HomeWorks011.Core.Models.Contact;
import HomeWorks.HomeWorks011.Core.Transfer.CSVexport;
import HomeWorks.HomeWorks011.Core.Transfer.CSVimport;
import HomeWorks.HomeWorks011.Core.Transfer.JSONexport;
import HomeWorks.HomeWorks011.Core.Transfer.JSONimport;

public class Presenter {
    private PhoneBook book;

    public ViewModel viewModel;

    public Presenter(ViewModel viewModel, PhoneBook book) {
        this.viewModel = viewModel;
        this.book = book;
    }

    private void updateContact() throws Exception {
        String temp_name = viewModel.getContactName();
        while (book.searchContact(temp_name) == null) {
            System.out.print("\033[H\033[J");
            viewModel.showBook(book);
            temp_name = viewModel.getContactName();
        }
        viewModel.updateContactMenu();
        switch (viewModel.getChoice()) {
            case 1 -> {
                book.updateContactName(temp_name, viewModel.getContactName("новое"));
                viewModel.print("Готово");
                this.mainMenu();
            }
            case 2 -> {
                int count_phones = 1;
                for (String phone : book.searchContact(temp_name).getPhoneNumbers()) {
                    System.out.printf("%d. %s\n", count_phones++, phone);
                }
                book.updatePhoneNumber(temp_name, viewModel.getChoice("Какой номер меняем?"), viewModel.getPhoneNumber());
                viewModel.print("Готово");
                this.mainMenu();
            }
            case 3 -> {
                int count_emails = 1;
                for (String phone : book.searchContact(temp_name).getPhoneNumbers()) {
                    System.out.printf("%d. %s", count_emails++, phone);
                }
                book.updateEmails(temp_name, viewModel.getChoice("Какой адресс меняем?"), viewModel.getEmail());
                viewModel.print("Готово!");
                this.mainMenu();
            }
            default -> {
                viewModel.print("1 2 или 3");
                this.updateContact();
            }
        }
    }

    public void mainMenu() throws Exception {
        System.out.print("\033[H\033[J");
        int user_choice = 0;
        while (user_choice != 8) {
            viewModel.mainMenu();
            user_choice = viewModel.getChoice("номер");
            switch (user_choice) {
                case 1 -> {
                    viewModel.showBook(book);
                }
                case 2 -> {
                    System.out.print("\033[H\033[J");
                    System.out.println("Добавляем новый контакт!");
                    book.addContact(new Contact(viewModel.getContactName(), viewModel.getPhoneNumber(), viewModel.getEmail()));

                }
                case 3 -> {
                    System.out.print("\033[H\033[J");
                    System.out.println("Удаляем контакт!");
                    if (book.deleteContact(viewModel.getContactName())){
                        viewModel.print("Готово!");
                        this.mainMenu();
                    } else {viewModel.print("Контакт не найден");
                        this.mainMenu();
                    }

                }
                case 4 -> {
                    System.out.print("\033[H\033[J");
                    System.out.println("Поиск по справочнику");
                    viewModel.showContact(book.searchContact(viewModel.getContactName()));
                }
                case 5 -> {
                    System.out.println("У кого и что меняем?");
                    System.out.print("\033[H\033[J");
                    this.updateContact();
                }
                case 6 -> {
                    System.out.print("\033[H\033[J");
                    viewModel.importExportMenu();
                    switch (viewModel.getChoice()){
                        case 1 -> new CSVimport(book).importFrom("HomeWorks/HomeWorks011/data.scv");
                        case 2 -> new JSONimport(book).importFrom("HomeWorks/HomeWorks011/data.json");
                        default -> {viewModel.print("Только 1 или 2");
                            this.mainMenu();}
                    }
                }
                case 7 -> {
                    System.out.print("\033[H\033[J");
                    viewModel.importExportMenu();
                    switch (viewModel.getChoice()){
                        case 1 -> new CSVexport(book).exportTo("HomeWorks/HomeWorks011/data.scv");
                        case 2 -> new JSONexport(book).exportTo("HomeWorks/HomeWorks011/data.json");
                        default -> {viewModel.print("Только 1 или 2");
                            this.mainMenu();}
                    }
                    new CSVexport(book).exportTo("HomeWorks/HomeWorks011/data.scv");}
                case 8 -> viewModel.bye();
                default -> {
                    viewModel.print("Команда не найдена");
                    this.mainMenu();
                }
            }
        }
    }
}
