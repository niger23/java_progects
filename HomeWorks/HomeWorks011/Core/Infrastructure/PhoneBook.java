package HomeWorks.HomeWorks011.Core.Infrastructure;

import java.util.ArrayList;
import java.util.HashMap;

import HomeWorks.HomeWorks011.Core.Models.Contact;
import HomeWorks.HomeWorks011.Core.Models.CheckValid.EmailValidityCheck;
import HomeWorks.HomeWorks011.Core.Models.CheckValid.PhoneNumberValidityCheck;


public class PhoneBook {
    private HashMap<String, Contact> book;

    public PhoneBook(HashMap<String, Contact> book) {
        this.book = book;
    }

    public PhoneBook() {
        this.book = new HashMap<String, Contact>();
    }

    public boolean addContact(Contact contact) {
        if (book.containsKey(contact.getName()))
            return false;
        else {
            book.put(contact.getName(), contact);
            return true;
        }
    }


    public boolean deleteContact(String name) {
        return book.remove(name) != null;
    }

    public Contact searchContact(String name) {
        return book.get(name);
    }

    public void updateContactName(String oldName, String newName) {
        Contact temp = book.get(oldName);
        temp.setName(newName);
        book.remove(oldName);
        book.put(newName, temp);
    }


    public void updatePhoneNumber(String name, int index, String newPhone) {
        Contact temp = book.get(name);
        ArrayList<String> temp_phones = temp.getPhoneNumbers();
        PhoneNumberValidityCheck.isValidPhoneNumber(newPhone);
        temp_phones.set(index - 1, newPhone);
        temp.setPhoneNumbers(temp_phones);
        book.put(name, temp);
    }

    public void updateEmails(String name, int index, String newEmail) {
        Contact temp = book.get(name);
        ArrayList<String> temp_emails = temp.getEmails();
        EmailValidityCheck.isValidEmail(newEmail);
        temp_emails.set(index - 1, newEmail);
        temp.setEmails(temp_emails);
        book.put(name, temp);
    }


    public HashMap<String, Contact> getBook() {
        return book;
    }

    public int size() {
        return book.size();
    }
}
