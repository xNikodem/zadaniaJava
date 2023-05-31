package Test2.Zadanie5;

public class CzystyStudent extends Osoba implements Student {
    private double stypendium;

    public CzystyStudent(String imie, String nazwisko, String pesel) {
        super(imie, nazwisko, pesel);
    }

    @Override
    public double getStypendium() {
        return 0;
    }

}
