package homeWork3;

import java.util.Scanner;

public class Seasons_enum {
  
    public void checkSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца (от января до декабря): ");
        String month = scanner.nextLine();


        switch (month) {
            case "декабрь":
            case "январь":
            case "февраль":
                System.out.print("WINTER");
                break;
            case "март":
            case "апрель":
            case "май":
                System.out.print("SPRING");
                break;
            case "июнь":
            case "июль":
            case "август":
                System.out.print("SUMMER");
                break;
            case "сентябрь":
            case "октябрь":
            case "ноябрь":
                System.out.print("FALL");
                break;
            default:

        }
        System.out.println("Этот месяц относится к сезону: ");
    }
}
