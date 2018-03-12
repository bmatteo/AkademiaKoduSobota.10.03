public class Czlowiek implements Comparable<Czlowiek> {
    private char plec;
    private String imie;
    private String nazwisko;

    public Czlowiek(char plec, String imie, String nazwisko) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
    @Override
    public String toString() {
        return nazwisko + " " + imie+" (" + plec +")" ;
    }
    @Override
    public int compareTo(Czlowiek o) {
        int porownaneNazwiska = nazwisko.compareTo(o.nazwisko);
        if(porownaneNazwiska == 0) {
            return imie.compareTo(o.imie);
        }
        else {
            return porownaneNazwiska;
        }
    }
}
