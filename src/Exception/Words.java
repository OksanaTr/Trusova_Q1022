package Exception;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Words {
    public static void readData (String args) {
        Scanner scanner = new Scanner(System.in);
        MyExcService service = new LocalMemoryService();


        while (true){
            String next = scanner.next();
            if("exit".equals(next)) {
                break;
            }else if("get".equals(next)){
                try {
                    System.out.println(service.get());
                } catch (NoSuchElementException e){
                    System.out.println("no elements");
                }
            }else{
                try{
                    service.add(next);
                    } catch (LowMemoryException e) {
                    System.out.println("memory is full");
                }
            }
        }
    }}