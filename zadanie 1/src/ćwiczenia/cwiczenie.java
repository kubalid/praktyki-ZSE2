package ćwiczenia;

public class cwiczenie {
    private  char plec;
    private double wzrost;
    private char plec;
    private double rozmiar_buta;
    private boolean czy_lysy = false;
    private String kolor_wlosow;
    private int wiek;
    cwiczenie[] matka;
    cwiczenie[] ojciec;
    cwiczenie[] rodzice;

    void setKolor_wlosow(String kolor){
        if(!czy_lysy){
            this.kolor_wlosow = kolor;

        }
        else{
            System.out.println("przecież jest łysy");
        }

    }

    public void setWzrost(double wzrost) {
        this.wzrost = wzrost;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public void setRozmiar_buta(double rozmiar_buta) {
        this.rozmiar_buta = rozmiar_buta;
    }

    public void setCzy_lysy(boolean czy_lysy) {
        this.czy_lysy = czy_lysy;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


    public void setRodzice(cwiczenie[] rodzice) {
        this.rodzice = rodzice;
    }
}
