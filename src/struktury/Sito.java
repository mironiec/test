package struktury;

import java.util.Arrays;

public class Sito {
    public boolean[] tab;
    public int indeks;

    public Sito(int size) {
        createTable(size);

    }

    public Sito() {
    }

    public void createTable(int size){
        tab = new boolean[size + 1];
        for (int i = 0; i <tab.length ; i++) {
            tab[i] = true;
        }
        tab[0] = false;
        tab[1] = false;
    }

    public void szukaj(){
        for (int i = 2; i <tab.length ; i++) {
            indeks = i;
            for (int y = (indeks+indeks) ; y<tab.length; y=y+ indeks) if (tab[y] == true) tab[y] = false;
        }
    }


    public boolean sprawdz(int n) {
        return tab[n];
    }

    @Override
    public String toString() {
        return "Sito{" +
                "tab=" + Arrays.toString(tab) +
                '}';
    }

    public boolean[] getTab() {
        return tab;
    }
    public void print() {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] ==  true) System.out.print(i+" ");
        }
    }
}
