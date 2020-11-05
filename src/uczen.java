import java.util.Scanner;
class uczen {

String nazwisko;
String Imie;
int wiek;
}

class dane
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        uczen uczen = new uczen();

        System.out.println("Podaj imię");
        uczen.Imie = scan.nextLine();
        System.out.println("Podaj nazwisko");
        uczen.nazwisko = scan.nextLine();
        System.out.println("Podaj wiek");
        uczen.wiek = scan.nextInt();

        System.out.println("twoje imie to "+uczen.Imie+" Nazwisko to "+uczen.nazwisko+" a twój wiek wynosi "+uczen.wiek );

    }
}