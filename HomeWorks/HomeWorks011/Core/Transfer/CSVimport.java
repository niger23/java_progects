package HomeWorks.HomeWorks011.Core.Transfer;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

import HomeWorks.HomeWorks011.Core.Infrastructure.PhoneBook;
import HomeWorks.HomeWorks011.Core.Models.Contact;

public class CSVimport implements Importer{
    private PhoneBook book;

    public CSVimport(PhoneBook book) {
        this.book = book;
    }

    @Override
    public boolean importFrom(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;

            while ((line = br.readLine()) != null) {
                String contact_name = null;
                ArrayList<String> contactPhoneNumbers = new ArrayList<>();
                ArrayList<String> contactEmails = new ArrayList<>();
                String[] values = line.split(";");

                contact_name = values[0];
                Arrays.stream(values[1].split(",")).iterator().forEachRemaining(contactPhoneNumbers::add);
                Arrays.stream(values[2].split(",")).iterator().forEachRemaining(contactEmails::add);
                Contact contact = new Contact(contact_name, contactPhoneNumbers.get(0), contactEmails.get(0));
                contact.setPhoneNumbers(contactPhoneNumbers);
                contact.setEmails(contactEmails);
                book.addContact(contact);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
