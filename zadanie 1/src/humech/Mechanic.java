package humech;

public class Mechanic extends human {
    int lata_w_pracy; /
    boolean w_gotowości;
    String imie;
    String nazwisko;

    public Mechanic(double wzrost, char plec, double rozmiar_buta, boolean czy_lysy, String color_wlosow, int wiek, human[] rodzice, int lata_w_pracy, boolean w_gotowości, String imie, String nazwisko)
    {
        super( wzrost, plec, rozmiar_buta, czy_lysy, color_wlosow, wiek, rodzice);
        this.lata_w_pracy = lata_w_pracy;
        this.w_gotowości = w_gotowości;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}