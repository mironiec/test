package SPOJ;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class taby {


    public static void main(String[] args) {

        String[] liczba;
        Scanner nw = new Scanner(System.in);
        int n_test = Integer.parseInt(nw.nextLine());
        for (int y=0;y<n_test;y++) {
            String linia;
            linia = nw.nextLine();
            liczba = linia.split(" ");
            int r = Integer.valueOf(liczba[0]);
            int[] tab = new int[r];
            for (int a = 1; a < liczba.length; a++) tab[a-1] = Integer.parseInt(liczba[a]);
            for (int i = tab.length - 1; i > -1; i--) {
                System.out.print(tab[i] + " ");
            }
            System.out.println();
        }
    }
}
