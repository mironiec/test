package SPOJ;

import java.util.Scanner;

public class Suma {
    public static int suma = 0;

    public static void add(int liczba) {
        suma = suma + liczba;
    }

    public static void print(){
        System.out.println(suma);
    }

    public static void main(String[] args) {
        Scanner nw = new Scanner(System.in);

        while (nw.hasNextLine()) {
            int liczba = Integer.parseInt(nw.nextLine());
            add(liczba);
            print();
        }
    }
}
