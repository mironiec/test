package SPOJ;


import java.util.ArrayList;
import java.util.Scanner;

public class Gadu {
    public static ArrayList<Arraytab> tab_1 = new ArrayList<>();
    public static ArrayList<Arraytab> tab_2 = new ArrayList<>();
    static String haslo = "";
    static String pass = "";

    public static void dekoduj() {
        for (int i = 0; i < pass.length() ; i=i+2) {
            char a = pass.charAt(i);
            char b = pass.charAt(i+1);
            int a1 = 0;
            int b1 = 0;
            for (Arraytab arra:tab_1) {
                if (arra.getLitera()== a) a1=arra.getValue();
            }
            for (Arraytab arra:tab_2) {
                if (arra.getLitera()== b) b1=arra.getValue();
            }
            haslo = haslo +(char)(a1+b1);
        }
        System.out.println(haslo);
        haslo="";
    }


    public static void main(String[] args) {
        System.out.println("Podaj wartości dla tablicy 1");

        Scanner nw =  new Scanner(System.in);
        for (int i = 0; i <16 ; i++) {
            String[] linia = nw.nextLine().split(" ");
            Arraytab arraytab =  new Arraytab(linia[0].charAt(0),Integer.parseInt(linia[1]));
            tab_1.add(i,arraytab);
        }
        System.out.println("Podaj wartości dla tablicy 2");


        for (int i = 0; i <16 ; i++) {
            String[] linia = nw.nextLine().split(" ");
            Arraytab arraytab =  new Arraytab(linia[0].charAt(0),Integer.parseInt(linia[1]));
            tab_2.add(i,arraytab);
        }

        System.out.println("Podaj hasło");
        pass=nw.nextLine();
        dekoduj();

    }
}
