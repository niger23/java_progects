package HomeWorks.HomeWorks011.Core.MVP;

import HomeWorks.HomeWorks011.Core.Infrastructure.PhoneBook;
import HomeWorks.HomeWorks011.Core.Models.Contact;

public interface ViewModel {
    void mainMenu();

    void updateContactMenu();

    void importExportMenu();

    int getChoice();

    int getChoice(String custom);

    String getContactName();

    String getContactName(String custom);

    String getPhoneNumber();

    String getEmail();

    void showContact(Contact contact);

    void showBook(PhoneBook book);

    void print(String information);

    void bye();

}
