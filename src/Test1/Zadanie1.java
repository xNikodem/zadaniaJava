package Test1;
public class Zadanie1 {
    public static void narysujKlepsydre(int wys) {
        if (wys % 2 == 0) {
            System.out.println("Nie można narysować klepsydry o parzystej wysokości.");
            return;
        }

        int middle = wys / 2;

        for (int i = 0; i < wys; i++) {
            for (int j = 0; j < wys; j++) {
                if (i <= middle) {
                    if (j >= i && j < (wys - i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    if (j >= (wys - i - 1) && j <= i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
