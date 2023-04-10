import homeWork3.Seasons_enum;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

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

                Seasons_enum.Season season;
                switch (month) {
                        case "декабрь":
                        case "январь":
                        case "февраль":
                                season = Seasons_enum.Season.WINTER;
                                break;
                        case "март":
                        case "апрель":
                        case "май":
                                season = Seasons_enum.Season.SPRING;
                                break;
                        case "июнь":
                        case "июль":
                        case "август":
                                season = Seasons_enum.Season.SUMMER;
                                break;
                        case "сентябрь":
                        case "октябрь":
                        case "ноябрь":
                                season = Seasons_enum.Season.FALL;
                                break;
                        default:
                                throw new IllegalArgumentException("Некооректные дянные месяца: " + month);
                }
                System.out.println("Этот месяц относится к сезону: " + season);
        }
}



