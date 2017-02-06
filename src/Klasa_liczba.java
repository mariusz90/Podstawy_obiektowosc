import java.util.Scanner;

/**
 * Created by MariuszZ on 2017-02-06.
 */
public class Klasa_liczba {
    private int liczbaWprowadzana;

    public void setLiczbaWprowadzana(int liczbaWprowadzana) {
        if(liczbaWprowadzana>0 && liczbaWprowadzana<=100) {
            this.liczbaWprowadzana = liczbaWprowadzana;
        }
        else
        {
            this.liczbaWprowadzana = -1;
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

    public int getLiczbaWprowadzana() {
        return liczbaWprowadzana;
    }


}
