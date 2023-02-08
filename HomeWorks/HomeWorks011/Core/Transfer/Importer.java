package HomeWorks.HomeWorks011.Core.Transfer;

import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

public interface Importer {
    boolean importFrom(String path) throws FileNotFoundException, UnsupportedEncodingException;
}
