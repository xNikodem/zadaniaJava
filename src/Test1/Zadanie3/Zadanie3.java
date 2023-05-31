package Test1.Zadanie3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class Zadanie3 {

    public static String znajdzNajstarszaOsobe(Osoba[] osoby) {
        return Objects.requireNonNull(Arrays.stream(osoby)
                .max(Comparator.comparingInt(Osoba::getWiek))
                .orElse(null)).toString();
    }

    public static String znajdzNajmlodszaOsobe(Osoba[] osoby) {
        return Objects.requireNonNull(Arrays.stream(osoby)
                .min(Comparator.comparingInt(Osoba::getWiek))
                .orElse(null)).toString();
    }
}

