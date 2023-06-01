package Test3.Zadanie1;

import java.util.Optional;
import java.util.Scanner;

public class Zadanie1 {
    private static Scanner scanner = new Scanner(System.in);

    public static int getNameLength() {
        System.out.println("Podaj swoje imię:");
        return Optional.ofNullable(scanner.nextLine())
                .map(String::length)
                .orElse(0);
    }

    public static String getBirthDateFromPesel() throws InvalidPeselException {
        System.out.println("Podaj swój PESEL:");
        String pesel = Optional.ofNullable(scanner.nextLine())
                .filter(p -> p.length() == 11)
                .orElseThrow(() -> new InvalidPeselException("Invalid PESEL."));

        String year = pesel.substring(0, 2);
        String month = pesel.substring(2, 4);
        String day = pesel.substring(4, 6);

        if (Integer.parseInt(month) > 20) {
            year = "20" + year;
            month = String.format("%02d", Integer.parseInt(month) - 20);
        } else {
            year = "19" + year;
            month = String.format("%02d", Integer.parseInt(month));
        }

        return day + "/" + month + "/" + year;
    }
}
