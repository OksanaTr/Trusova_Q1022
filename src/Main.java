import java.util.Scanner;
import java.util.concurrent.atomic.AtomicIntegerArray;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        @Deprecated String letter;
        String Letter = scanner.nextLine().toLowerCase();
        if (letter.equals("a")||
                letter.equals("o")||
                letter.equals("e")||
                letter.equals("i")||
                letter.equals("u")) {
            System.out.print("Гласная буква");
        }
        else {
            System.out.print("Согласная букваж: ");}
    }
}

