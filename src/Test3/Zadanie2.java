package Test3;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie2 {
    public static List<Integer> getTop5(List<Integer> numbers) {
        return numbers.stream()
                .sorted(Collections.reverseOrder())
                .limit(5)
                .collect(Collectors.toList());
}
}
