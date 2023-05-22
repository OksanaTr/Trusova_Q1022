package Exception;

import java.util.NoSuchElementException;

public class LocalMemoryService implements MyExcService {
    private List<String> List = ArrayList<>();



    @Override
    public void add (String text) throws LowMemoryExceotion {
     if (List.size() > 4) {
         throw new LowMemoryExceotion();
     } else {list.add(text);
     }
    }

        @Override
        public String get()  throws NoSuchElementException {
           if (list.size() == 0){
               throw new NoSuchElementException();
        } else {
               return List.remove(0);
           }
     }
    }

