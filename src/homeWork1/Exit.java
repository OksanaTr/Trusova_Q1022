package homeWork1;

import java.util.Scanner;

public class Exit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print(" Введите слово: ");
            String inputWord = scanner.nextLine();
            if (inputWord.equals("exit")) {
                System.out.print(" Программа завершена.");
                break;
            } else {
                System.out.print(" Вы ввели: " + inputWord);
            }
        } scanner.close();
    }

}

