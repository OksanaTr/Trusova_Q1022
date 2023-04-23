package homeWork3;

import java.util.Scanner;
    enum MONTH {
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULE,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER,
    }
public class Seasons_enum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите название месяца: ");
        String month = scanner.nextLine();


        switch (month) {
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                System.out.println("Этот месяц относится к сезону: ");
                System.out.print("WINTER");
                break;
            case "MARCH":
            case "APRIL":
            case "MAY":
                System.out.println("Этот месяц относится к сезону: ");
                System.out.print("SPRING");
                break;
            case "JUNE":
            case "JULE":
            case "AUGUST":
                System.out.println("Этот месяц относится к сезону: ");
                System.out.print("SUMMER");
                break;
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                System.out.println("Этот месяц относится к сезону: ");
                System.out.print("FALL");
                break;
            default:
                System.out.println("Неверно введены данные");}}

}
