package GRY;

import java.util.Scanner;

public class ZgadywankaLiczb {

    static boolean wynik = false;
    static int txt = 0;

    public static void jaka_jest(int liczba, Gra gra ){
        if ( liczba > gra.getLiczba() ) System.out.println("Podałeś za dużą liczbę, spróbuj raz jeszcze");
        if ( liczba < gra.getLiczba() ) System.out.println("Podałeś za małą liczbę, spróbuj raz jeszcze");
        if ( liczba == gra.getLiczba()) wynik = true;
    }
    public static void main(String[] args) {
       Gra gra = new Gra();
        System.out.println("Cześć Użytkowniku ");
        System.out.println("Została wylosowana liczba, zgadnij jaka to jest !!!");
        int proba = 0;

        Scanner nw = new Scanner(System.in);
        //boolean wynik = false;
        while (!wynik) {
            proba ++;
            System.out.println("podaj liczbę, próba nr " + proba);
            txt = nw.nextInt();
            jaka_jest(txt,gra);
            if (txt==gra.getLiczba())  wynik = true;
        }
        System.out.println("Brawo!!!");
    }

}
