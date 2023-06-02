package pl.javastart.task;

import java.util.Arrays;

public enum Season {
    SPRING("Wiosna", new String[]{"marzec", "kwiecień", "maj"}),
    SUMMER("Lato", new String[]{"czerwiec, lipiec, sierpień "}),
    AUTUMN("Jesień", new String[]{"wrzesień, październik, listopad"}),
    WINTER("Zima", new String[]{"grudzień, styczeń, luty"});

    private final String plName;
    private final String[] months;

    public String[] getMonths() {
        return months;
    }

    public String getPlName() {
        return plName;
    }

    Season(String plName, String[] months) {
        this.plName = plName;
        this.months = months;
    }

    @Override
    public String toString() {
        return "Season{" +
                "plName='" + plName + '\'' +
                ", months=" + Arrays.toString(months) +
                '}';
    }
}