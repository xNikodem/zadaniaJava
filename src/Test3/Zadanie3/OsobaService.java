package Test3.Zadanie3;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OsobaService {

    static class NoWomenException extends RuntimeException {
        NoWomenException(String message) {
            super(message);
        }
    }

    private List<Osoba> osoby;

    public OsobaService(List<Osoba> osoby) {
        this.osoby = osoby;
    }

    public Osoba getNajstarszaKobieta() {
        return osoby.stream()
                .filter(osoba -> osoba.getImie().endsWith("a"))
                .max(Comparator.comparing(Osoba::getWiek))
                .orElseThrow(() -> new NoWomenException("Brak kobiet na liście"));
    }

    public double getSredniWiek() {
        return osoby.stream()
                .mapToInt(Osoba::getWiek)
                .average()
                .orElse(0);
    }

    public double getSredniWiekZaleznyOdPlci(Function<Osoba, Boolean> plec) {
        return osoby.stream()
                .filter(plec::apply)
                .mapToInt(Osoba::getWiek)
                .average()
                .orElse(0);
    }

    public String getNajpopularniejszeMiasto() {
        return osoby.stream()
                .collect(Collectors.groupingBy(Osoba::getMiasto, Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    public Set<String> getUnikalneMiasta() {
        return osoby.stream()
                .map(Osoba::getMiasto)
                .collect(Collectors.toSet());
    }
}
