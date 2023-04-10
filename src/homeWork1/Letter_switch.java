package homeWork1;

import java.util.Scanner;

public class Letter_switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите букву: ");
        String letter = scanner.nextLine().toLowerCase();

        switch (letter) {
            case "a":
            case "i":
            case "o":
            case "u":
            case "e":
                System.out.print("Гласная буква");
                break;
            default:

                System.out.print("Согласная буква");
                break;
       }
    }
    }
