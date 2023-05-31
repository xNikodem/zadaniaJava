package Test3.Zadanie1;
import java.util.Optional;
import java.util.Scanner;

public class Zadanie1 {
    private static Scanner scanner = new Scanner(System.in);

    public static int getNameLength() {
        System.out.println("Podaj swoje imię:");
        String name = scanner.nextLine();
        Optional<String> optionalName = Optional.ofNullable(name);

        return optionalName.map(String::length).orElse(0);
    }

    public static String getBirthDateFromPesel() throws InvalidPeselException {
        System.out.println("Podaj swój PESEL:");
        String pesel = scanner.nextLine();
        Optional<String> optionalPesel = Optional.ofNullable(pesel);

        return optionalPesel.filter(p -> p.length() == 11)
                .orElseThrow(() -> new InvalidPeselException("Invalid PESEL."));
    }

}
