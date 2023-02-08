package HomeWorks.HomeWorks011.Core.Transfer;

import java.io.FileNotFoundException;

public interface Exporter {
    boolean exportTo(String path) throws FileNotFoundException;
}
