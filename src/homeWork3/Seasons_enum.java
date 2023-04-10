package homeWork3;

import java.util.Scanner;

public class Seasons_enum {
    public enum Season {
       WINTER,
        SPRING,
        SUMMER,
        FALL
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца (от января до декабря): ");
        String month = scanner.nextLine();

        Season season;
        switch (month) {
            case "декабрь":
            case "январь":
            case "февраль":
                season = Season.WINTER;
                break;
            case "март":
            case "апрель":
            case "май":
                season = Season.SPRING;
                break;
            case "июнь":
            case "июль":
            case "август":
                season = Season.SUMMER;
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                season = Season.FALL;
                break;
            default:
                throw new IllegalArgumentException("Некооректные дянные месяца: " + month);
        }
        System.out.println("Этот месяц относится к сезону: " + season);
    }
}
