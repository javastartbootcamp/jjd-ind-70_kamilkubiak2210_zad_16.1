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

    public void printInfoAboutSeason(String seasonAsText) {
        Season season = Season.findSeasonByPlName(seasonAsText);
        if (season != null) {
            System.out.println("W tej porze roku są następujące miesiące:");
            System.out.println(Arrays.toString(season.getMonths()));
        } else {
            System.out.println("Nieznany format");
        }

    }

    public void printNamesOfSeasons() {
        Season[] values = Season.values();
        for (Season value : values) {
            System.out.println(value.getPlName());
        }
    }
}


