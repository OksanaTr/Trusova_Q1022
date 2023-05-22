package Exception;

import java.util.NoSuchElementException;

public interface MyExcService  {
    void add (String text) throws LowMemoryException;

    String get() throws NoSuchElementException;

    }
