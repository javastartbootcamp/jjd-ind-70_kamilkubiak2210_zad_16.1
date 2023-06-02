package pl.javastart.task;

import java.util.Arrays;
import java.util.Scanner;

public class SeasonManager {

    // uzupełnij metodę- do wczytywania danych użyj przekazany Scanner
    public void run(Scanner scanner) {
        System.out.println("Podaj porę roku:");
        printNamesOfSeasons();
        String season = scanner.nextLine();
        printInfoAboutSeason(season);

    }

    public static void printInfoAboutSeason(String season) {
        if (season.equalsIgnoreCase(String.valueOf(Season.SPRING.getPlName()))) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(Season.SPRING.getMonths()));
        } else if (season.equalsIgnoreCase(String.valueOf(Season.SUMMER.getPlName()))) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(Season.SUMMER.getMonths()));
        } else if (season.equalsIgnoreCase(String.valueOf(Season.AUTUMN.getPlName()))) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(Season.AUTUMN.getMonths()));
        } else if (season.equalsIgnoreCase(String.valueOf(Season.WINTER.getPlName()))) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(Season.WINTER.getMonths()));
        } else {
            System.out.println("Nieznany format");
        }
    }

    public static void printNamesOfSeasons() {
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value.getPlName());
        }
    }
}


