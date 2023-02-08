package HomeWorks.HomeWorks011.Core.Models;

import java.util.ArrayList;

import HomeWorks.HomeWorks011.Core.Models.CheckValid.EmailValidityCheck;
import HomeWorks.HomeWorks011.Core.Models.CheckValid.PhoneNumberValidityCheck;
import HomeWorks.HomeWorks011.Core.Models.Exceptions.BadEmailException;
import HomeWorks.HomeWorks011.Core.Models.Exceptions.BadPhoneNumberException;

public class Contact {
    private String name;
    private ArrayList<String> phoneNumbers;
    private ArrayList<String> emails;


    public Contact(String name, String number, String email) throws Exception {
        this.name = name;
        this.phoneNumbers = new ArrayList<String>();
        if (!PhoneNumberValidityCheck.isValidPhoneNumber(number)) throw new BadPhoneNumberException();
        this.phoneNumbers.add(number);
        this.emails = new ArrayList<String>();
        if (!EmailValidityCheck.isValidEmail(email)) throw new BadEmailException();
        this.emails.add(email);
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public ArrayList<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmails(ArrayList<String> emails) {
        this.emails = emails;
    }

    public void setPhoneNumbers(ArrayList<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void addPhoneNumber(String number) {
        phoneNumbers.add(number);
    }

    public void addEmail(String email) {
        phoneNumbers.add(email);
    }

    @Override
    public String toString() {
        return String.format("Имя: %s\nНомер: %s\nE'mail: %s\n", name, phoneNumbers, emails);
    }

}
