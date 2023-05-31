package Test2;

import Test2.Zadanie4.MinMax;
import Test2.Zadanie4.MinMaxService;

import java.io.File;
import java.io.IOException;
import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Test2 {
    public static void zadanie1(){
        String directory = "C:\\Users\\nikob\\IdeaProjects";
        try {
            File largestJavaFile = Zadanie1.findLargestJavaFile(directory);
            if (largestJavaFile != null) {
                System.out.println("Największy plik Java znajduje się pod ścieżką: " + largestJavaFile.getPath());
                System.out.println("Rozmiar pliku: " + largestJavaFile.length() / 1024 + " kilobajtów");
            } else {
                System.out.println("Nie znaleziono plików Java w podanym katalogu.");
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas przeszukiwania katalogu: " + e.getMessage());
        }
    }

    public static void zadanie2(){
        String directory = "C:\\Users\\nikob\\IdeaProjects";
        try {
            Map<DayOfWeek, Integer> dayOfWeekCountMap = Zadanie2.countFilesCreationDay(directory);
            for (DayOfWeek dayOfWeek : DayOfWeek.values()) {
                System.out.println(dayOfWeek + ": " + dayOfWeekCountMap.getOrDefault(dayOfWeek, 0));
            }
        } catch (IOException e) {
            System.out.println("Błąd podczas przeszukiwania katalogu: " + e.getMessage());
        }
    }
    /*
    * Zadanie 2:
        MONDAY: 38
        TUESDAY: 3
        WEDNESDAY: 14
        THURSDAY: 27
        FRIDAY: 0
        SATURDAY: 3
        SUNDAY: 2
    * Dałem też plik .ts .hmtl .css gdyż ich jest najwiecej
    * oraz zignorowałem node_modules
    */
    public static void zadanie3(){
        System.out.println(Zadanie3.getFibonacciIndex(8));
    }

    public static void zadanie4(){
        List<Integer> numbers = Arrays.asList(5, 3, 8, 1, 9, 2);
        MinMax<Integer> minMaxNumbers = MinMaxService.getMinAndMax(numbers);
        System.out.println("Min: " + minMaxNumbers.getMin());
        System.out.println("Max: " + minMaxNumbers.getMax());

        List<String> strings = Arrays.asList("apple", "banana", "cherry", "pineapple", "apricot");
        MinMax<String> minMaxStrings = MinMaxService.getMinAndMax(strings);
        System.out.println("Min: " + minMaxStrings.getMin());
        System.out.println("Max: " + minMaxStrings.getMax());

    }
}
