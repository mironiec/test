package SPOJ;


import java.util.LinkedList;
import java.util.Scanner;


public class JZLICZ {
    public static LinkedList<Licz> listaZ = new LinkedList<>();


    public static void add(char litera) {

        for (Licz licz:listaZ ) {
            if (licz.getLitera()==litera) {
                int ile = licz.getIle() +1;
                licz.setIle(ile);
            }
        }
    }

    public static int indeks(char litera) {
        for (Licz licz:listaZ ) {
           if (licz.getLitera()==litera) {
               //System.out.println("litera " + litera + " indeks: " + listaZ.indexOf(licz) );
               return listaZ.indexOf(licz);
           }
        }
        return -1;
    }

    public static void dodaj(char lite){
        if (indeks(lite)!=-1) {
            add(lite);
        } else {
            Licz litera = new Licz();
            litera.setLitera(lite);
            litera.setIle(1);
            listaZ.addLast(litera);

        }

    }

    public static void zlicz(String tekst){
        char znak;

        for (int i = 0; i <tekst.length() ; i++) {
        znak = tekst.charAt(i);
        if (znak!=' ') dodaj(znak);
        }
    }

    public static void print(LinkedList<Licz> listaZ) {
        for (Licz licz:listaZ) {
            System.out.println(licz.getLitera() + " " + licz.getIle());
        }
    }

    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);
        int test = Integer.parseInt(nw.nextLine());
        for (int i = 0 ; i < test ; i++ ) {
            String tekst = nw.nextLine();
            zlicz(tekst);
        }
        print(listaZ);
    }
}

