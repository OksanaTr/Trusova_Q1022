package homeWork1;

import java.util.Scanner;

public class TotalNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        int sum = 0;
        for (int i = firstNumber + 1; i < secondNumber; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("Сумма всех чисел, которыее делятся на 3 и располложены между " + firstNumber + "и"+ secondNumber + ":" + sum);
    }
}

