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
    public String getLiczbaSlownie()
    {
        return liczbaSlownie;
    }
    public void setLiczbaSlownie()
    {
        String jednosc [] = {"","jeden","dwa","trzy","cztery","pięć","sześć","siedem","osiem","dziewięć","dziesięść"};

        String nascie = "naście";
        String dziescia = "dzieścia";
        String dziesci = "dzieści";
        String dziesiat = "dziesiąt";
        String zero = "zero";
        String sto = "sto";
        String pozaZakres = "Liczba po za zakresem";

        int liczba = (liczbaWprowadzana-(liczbaWprowadzana%10))/10;

        if(liczbaWprowadzana == -1)
        {
            this.liczbaSlownie = pozaZakres;
        }
        else if (liczbaWprowadzana == 100)
        {
            this.liczbaSlownie = sto;
        }
        else if (liczbaWprowadzana == 0)
        {
            this.liczbaSlownie = zero;
        }

        if(liczbaWprowadzana>0 & liczbaWprowadzana<11)
        {
            this.liczbaSlownie = jednosc[liczbaWprowadzana];
        }
        else if(liczbaWprowadzana>10 && liczbaWprowadzana<19)
        {
            this.liczbaSlownie = jednosc[liczbaWprowadzana%10]+nascie;
        }
        else if(liczbaWprowadzana>19 & liczbaWprowadzana< 30)
        {

            this.liczbaSlownie = jednosc[liczba]+dziescia+jednosc[liczbaWprowadzana%10];
        }
        else if(liczbaWprowadzana>30 & liczbaWprowadzana< 50)
        {
            this.liczbaSlownie = jednosc[liczba]+dziesci+jednosc[liczbaWprowadzana%10];
        }
        else if(liczbaWprowadzana>49 && liczbaWprowadzana<100)
        {
            this.liczbaSlownie = jednosc[liczba]+dziesiat+jednosc[liczbaWprowadzana%10];
        }


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
