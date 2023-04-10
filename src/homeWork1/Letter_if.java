package homeWork1;

import java.util.Scanner;

public class Letter_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите букву: ");
        String letter = scanner.nextLine().toLowerCase();
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
