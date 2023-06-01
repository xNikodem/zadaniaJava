package Test2.Zadanie4;

import java.util.List;

public class MinMaxService {
    public static <T extends Comparable<T>> MinMax<T> getMinAndMax(List<T> elements) {
        if (elements == null || elements.isEmpty()) {
            throw new IllegalArgumentException("List cannot be null or empty");
        }

        T min = elements.stream()
                .min(Comparable::compareTo)
                .orElseThrow(() -> new RuntimeException("Cannot find min value"));

        T max = elements.stream()
                .max(Comparable::compareTo)
                .orElseThrow(() -> new RuntimeException("Cannot find max value"));

        return new MinMax<>(min, max);
    }
}