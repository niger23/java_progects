package HomeWorks.HomeWorks011.Core.Transfer;

import java.io.*;

import HomeWorks.HomeWorks011.Core.Infrastructure.PhoneBook;
import HomeWorks.HomeWorks011.Core.Models.Contact;

public class CSVexport implements Exporter {
    
    private PhoneBook book;
    private static final String CSV_SEPARATOR = ";";

    public CSVexport(PhoneBook book) {
        this.book = book;
    }

    @Override
    public boolean exportTo(String path) throws FileNotFoundException {
        try {
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
            for (Contact contact : book.getBook().values()) {
                StringBuilder oneLine = new StringBuilder();
                oneLine.append(contact.getName());
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(String.join(", ", contact.getPhoneNumbers()));
                oneLine.append(CSV_SEPARATOR);
                oneLine.append(String.join(", ", contact.getEmails()));
                oneLine.append(CSV_SEPARATOR);
                bw.write(oneLine.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
