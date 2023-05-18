package Exception;

import java.util.Collection;
import java.util.ArrayList;

public class MyExcService {
    public static void main(String[] args) {
        // Создаем новую коллекцию
        Collection<String> stringCollection = new ArrayList<>();

        // Добавляем несколько элементов в коллекцию
        stringCollection.add("lemon");
        stringCollection.add("pear");
        stringCollection.add("apple");
        stringCollection.add("melon");

        // Печатаем число элементов в коллекции
        System.out.println("Number of elements: " + stringCollection.size());
        stringCollection.add("mango");
        // Удаляем элемент из коллекции
        stringCollection.remove("mango");

        // Опять печатаем число элементов в коллекции
        System.out.println("Number of elements: " + stringCollection.size());
    }
}