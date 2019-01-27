package SPOJ;

import java.util.Scanner;

public class Calc {

    public static int action(String znak, int liczba1, int liczba2 ) {
        int value = 0;
        switch (znak) {
            case "+":
                value =liczba1 + liczba2; break;
            case "-":
                value =  liczba1 - liczba2; break;
            case "*":
                value =  liczba1 * liczba2; break;
            case "/":
                value = liczba1 / liczba2; break;
            case "%":
                value = liczba1 % liczba2; break;
        } return value;
    }

    public static void main(String[] args) {
        String[] linia;
        int[] tab = new int[2];
        int n_test;
        Scanner nw = new Scanner(System.in);
        //n_test = Integer.parseInt(nw.nextLine());
        String dzialanie;
        while(nw.hasNextLine()) {
            linia = nw.nextLine().split(" ");
            dzialanie = linia[0];
            tab[0] = Integer.parseInt(linia[1]);
            tab[1] = Integer.parseInt(linia[2]);
            System.out.println(action(dzialanie,tab[0],tab[1]));
        }
    }
}
