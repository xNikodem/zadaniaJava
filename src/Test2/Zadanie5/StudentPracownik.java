package Test2.Zadanie5;

public class StudentPracownik extends Osoba implements Student, Pracownik {
    private double stypendium;
    private double pensja;

    public StudentPracownik(String imie, String nazwisko, String pesel) {
        super(imie, nazwisko, pesel);
    }

    @Override
    public double getPensja() {
        return 0;
    }

    @Override
    public double getStypendium() {
        return 0;
    }
}

