package SPOJ;

import java.util.Arrays;
import java.util.Scanner;

public class Tprime {

    public static boolean[] tab;
    public static int indeks;

    public static void Sito(int size) {
        createTable(size);

    }

    public static void createTable(int size) {
        tab = new boolean[size + 1];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = true;
        }
        tab[0] = false;
        tab[1] = false;
    }

    public static void szukaj() {
        for (int i = 2; i < tab.length; i++) {
            indeks = i;
            for (int y = (indeks + indeks); y < tab.length; y = y + indeks) if (tab[y] == true) tab[y] = false;
        }
    }


    public static boolean sprawdz(int n) {
        return tab[n];
    }

    @Override
    public String toString() {
        return "Sito{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }

    public static boolean[] getTab() {
        return tab;
    }

    public static void print() {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == true) System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);


        Sito(10000);
        szukaj();
        int n = nw.nextInt();
        int liczb;
        for (int i = 0; i < n; i++) {
            liczb = nw.nextInt();
            if (sprawdz(liczb)) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        }
        nw.close();
    }
}
