package Test3;

import Test3.Zadanie1.InvalidPeselException;
import Test3.Zadanie1.Zadanie1;
import Test3.Zadanie3.Osoba;
import Test3.Zadanie3.OsobaService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class Test3 {
    public static void zadanie1(){
        int nameLength = Zadanie1.getNameLength();
        System.out.println("Długość imienia: " + nameLength);

        try {
            String birthDate = Zadanie1.getBirthDateFromPesel();
            System.out.println("Data urodzenia (w formacie DD/MM/YYYY): " + birthDate);
        } catch (InvalidPeselException e) {
            e.printStackTrace();
        }
    }

    public static void zadanie2(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> top5 = Zadanie2.getTop5(numbers);
        System.out.println(top5);
    }

    public static void zadanie3(){
        List<Osoba> osoby = Arrays.asList(
                new Osoba("Jan", "Kowalski", "Warszawa", 30),
                new Osoba("Anna", "Nowak", "Kraków", 35),
                new Osoba("Marek", "Nowak", "Kraków", 28),
                new Osoba("Magda", "Zielińska", "Wrocław", 40),
                new Osoba("Piotr", "Kowalski", "Gdańsk", 33),
                new Osoba("Katarzyna", "Szczepańska", "Warszawa", 29),
                new Osoba("Andrzej", "Nowak", "Kraków", 34),
                new Osoba("Karolina", "Kowalska", "Wrocław", 25),
                new Osoba("Adam", "Adamowicz", "Gdańsk", 36),
                new Osoba("Agnieszka", "Nowak", "Kraków", 37),
                new Osoba("Krzysztof", "Kowalski", "Wrocław", 28),
                new Osoba("Ewa", "Nowak", "Warszawa", 45),
                new Osoba("Tomasz", "Kowalski", "Kraków", 32),
                new Osoba("Monika", "Zielińska", "Gdańsk", 38),
                new Osoba("Jacek", "Kowalski", "Warszawa", 40),
                new Osoba("Aleksandra", "Nowak", "Kraków", 35),
                new Osoba("Damian", "Kowalski", "Wrocław", 33),
                new Osoba("Joanna", "Szczepańska", "Gdańsk", 39),
                new Osoba("Robert", "Nowak", "Warszawa", 30),
                new Osoba("Kamila", "Zielińska", "Kraków", 35)
        );


        OsobaService service = new OsobaService(osoby);
        System.out.println(service.getNajstarszaKobieta().toString());
        System.out.println(service.getSredniWiek());
        System.out.println(service.getSredniWiekZaleznyOdPlci(osoba -> osoba.getImie().endsWith("a")));
        System.out.println(service.getSredniWiekZaleznyOdPlci(osoba -> !osoba.getImie().endsWith("a")));
        System.out.println(service.getNajpopularniejszeMiasto());
        System.out.println(service.getUnikalneMiasta());

        //zadanie 4
        Comparator<Osoba> comparator = Comparator.comparing(Osoba::getImie).thenComparing(Osoba::getNazwisko);
        TreeSet<Osoba> treeSet = new TreeSet<>(comparator);

        treeSet.addAll(osoby);

        System.out.println(treeSet);
    }
}
