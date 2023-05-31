package Test1;

import Test1.Zadanie3.Osoba;
import Test1.Zadanie3.Zadanie3;

public class Test1 {
    public static void zadanie1(){
        Zadanie1.narysujKlepsydre(7);
    }
  public static void zadanie2(){
      System.out.println( Zadanie2.czyPosortowana(new int[]{1,2,34,55}));
  }

  public static void zadanie3(){

      Osoba[] osoby= {
              new Osoba("Jan", "Kowalski", 30),
              new Osoba("Anna", "Nowak", 25),
              new Osoba("Adam", "Zieliński", 45),
              new Osoba("Ewa", "Wiśniewska", 35)
          };
      System.out.println("Najmłodsza osoba: "+Zadanie3.znajdzNajmlodszaOsobe(osoby));
      System.out.println("Najstarsza osoba: "+Zadanie3.znajdzNajstarszaOsobe(osoby));
  }

  public static void zadanie4(){
      int[] liczby = {11, 239, 59, 37, 5, 23, 111, 221};
      int[] superPierwsze = Zadanie4.getSuperPierwsze(liczby);

      for (int liczba : superPierwsze) {
          System.out.println(liczba);
      }
  }
}
