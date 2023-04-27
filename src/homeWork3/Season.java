package homeWork3;

import java.util.Scanner;



public class Season {
    public static void relateSeason(MONTH month) {
        switch (month){
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("WINTER");
                break;
            case MARCH:
            case APRIL:
            case MAY:
                System.out.println("SPRING");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("SUMMER");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("AUTUMN");
                break;
            default:
                System.out.println("Данные введены не верно");

        }
    }
}
