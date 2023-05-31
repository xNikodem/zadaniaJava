package Test3.Zadanie3;

public class Osoba {
    private String imie;
    private String nazwisko;
    private String miasto;
    private int wiek;

    public Osoba(String imie, String nazwisko, String miasto, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miasto = miasto;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getMiasto() {
        return miasto;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", miasto='" + miasto + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
