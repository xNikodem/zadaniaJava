package Test1;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Zadanie4 {

    public static int[] getSuperPierwsze(int[] liczby) {
        ArrayList<Integer> superPierwszeList = new ArrayList<>();

        for (int liczba : liczby) {
            if (jestPierwsza(liczba) && jestPierwsza(sumaCyfr(liczba))) {
                superPierwszeList.add(liczba);
            }
        }

        return superPierwszeList.stream().mapToInt(i -> i).toArray();
    }

    public static boolean jestPierwsza(int liczba) {
        if (liczba <= 1) {
            return false;
        }
        return IntStream.rangeClosed(2, (int) Math.sqrt(liczba)).noneMatch(i -> liczba % i == 0);
    }

    public static int sumaCyfr(int liczba) {
        int suma = 0;
        while (liczba != 0) {
            suma += liczba % 10;
            liczba /= 10;
        }
        return suma;
    }
}
