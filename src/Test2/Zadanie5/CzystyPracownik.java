package Test2.Zadanie5;

public class CzystyPracownik extends Osoba implements Pracownik {
    private double pensja;

    public CzystyPracownik(String imie, String nazwisko, String pesel) {
        super(imie, nazwisko, pesel);
    }

    @Override
    public double getPensja() {
        return 0;
    }

}
