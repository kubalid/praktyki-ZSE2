package ćwiczenia;

public class main {

    public static void main(String[] args) {

        cwiczenie kamil = new cwiczenie();
        cwiczenie kacper = new cwiczenie();
        cwiczenie andrzej = new cwiczenie();

        kamil.setKolor_wlosow("blond");
        kamil.setCzy_lysy(false);
        kamil.setPlec('m');
        kamil.setWzrost(170);

        andrzej.setKolor_wlosow("czarne");
        andrzej.setPlec('m');
        andrzej.setWiek(22);
        andrzej.setRozmiar_buta(42.5);
        cwiczenie matka = new cwiczenie();
        cwiczenie ojciec = new cwiczenie();
        cwiczenie[] rodzice = new cwiczenie[]{matka, ojciec};



        andrzej.setRodzice(rodzice);




    }
}
