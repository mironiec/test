package SPOJ;

import java.util.Scanner;

public class NWD {

    public static int NWD( int first, int last) {
        if (last == 0) { return first;}
        else
        {return NWD(last,(first%last));}
    }

    public static void main(String[] args) {
        String[] liczba = new String[1];
        int li1;
        int li2;
        String linia = "";
        Scanner nw = new Scanner(System.in);
        int liczba_test = Integer.parseInt(nw.nextLine());
        for (int i =0 ;i<liczba_test; i++) {
            linia = nw.nextLine();
            liczba =  linia.split(" ");
            li1 = Integer.parseInt(liczba[0]);
            li2 = Integer.parseInt(liczba[1]);
            System.out.println(NWD(li1,li2));
        }

    }
}
