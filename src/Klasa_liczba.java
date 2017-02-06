import java.util.Scanner;

/**
 * Created by MariuszZ on 2017-02-06.
 */
public class Klasa_liczba {
    private int liczbaWprowadzana;
    private String liczbaSlownie;

    public void setLiczbaWprowadzana(int liczbaWprowadzana) {
        if(liczbaWprowadzana>0 && liczbaWprowadzana<=100) {
            this.liczbaWprowadzana = liczbaWprowadzana;
        }
        else
        {
            this.liczbaWprowadzana = -1;
        }
    }
    public int getLiczbaWprowadzana() {
        return liczbaWprowadzana;
    }
    public void setLiczbaSlownie()
    {
        String jeden = "jeden";
        String dwa = "dwa";
        String trzy = "trzy";
        String cztery = "cztery";
        String piec = "pięć";
        String szesc = "sześć";
        String siedem = "siedem";
        String osiem = "osiem";
        String dziewiec = "dziewięć";
        String dziesięc = "dziesięść";

        String nascie = "naście";
        String dziescia = "dziescia";
        String dziesci = "dzieści";
        String dziesiat = "dziesiąt";
        String zero = "zero";
        String sto = "sto";
        String pozaZakres = "Liczba po za zakresem";

    }
    public Klasa_liczba(int liczbaWprowadzana)
    {
        setLiczbaWprowadzana(liczbaWprowadzana);
    }
    public Klasa_liczba()
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Podaj liczbe");
       int liczba  = sc.nextInt();
       setLiczbaWprowadzana(liczba);
    }




}
