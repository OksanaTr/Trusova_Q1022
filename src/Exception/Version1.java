package Exception;

import javax.xml.namespace.QName;
import java.util.InputMismatchException;
import java.util.Scanner;

import static com.sun.tools.javac.tree.TreeInfo.name;

public class Version1 {
        public void readData () {
            Scanner scanner = new Scanner(System.in);
            try {
                System.out.println("Введите дату рождения: ");
                int birthDate = Integer.parseInt(scanner.next());
                System.out.println("Введите год начало работы: ");
                int startWorking = Integer.parseInt(scanner.next());
                if (birthDate > 2021 || startWorking > 2021) {
                    System.out.println("Are you from future?! ");
                    scanner.close();
                }
                if (startWorking - (2021 - birthDate) > birthDate) {
                    System.out.println("Не коректные данные!");
                    scanner.close();
                }
                System.out.println("Введите имя: ");
                String name = scanner.next();
                System.out.println("Введите фамилию:");
                String lastName = scanner.nextLine();
                scanner.close();

            } catch (NumberFormatException | InputMismatchException exception) {
                System.out.println("Введите коректные данные!");


                }
            }

    private boolean name(String get) {
        if (name("get")) {
            throw new MyException(name(0));
        }
    }
}


