package SPOJ;

import java.util.Scanner;



 class Flamaster {
    public static Scanner nw = new Scanner(System.in);
    public static String tekst;
    public static char tab[];
    public static String tekstShort = "";
    public static int count = 0;



    public static int licz(char[] tab, char lit, int pos) {
        for (int i = pos; i < tab.length; i++) {
            if (tab[i] == lit) count += 1;
            if (tab[i] != lit) break;
        }
        int ile = count;
        count = 0;
        return ile;

    }

    public static void main(String[] args) {

       int ileT = Integer.parseInt(nw.nextLine());

        for (int j = 0;j!=ileT;j++) {
            tekst = nw.nextLine();
            tab = new char[tekst.length()];
            for (int i = 0; i < tekst.length(); i++) {
                tab[i] = tekst.charAt(i);
            }
            for (int i = 0; i <tab.length ; i++) {


                int a = licz(tab, tab[i], i);

                if ((a==1) || (a==2)) {
                    if (a==1) tekstShort = tekstShort + String.valueOf(tab[i]);
                    if (a==2) tekstShort = tekstShort + String.valueOf(tab[i])+ String.valueOf(tab[i]);
                }
                if (a>2) tekstShort = tekstShort + String.valueOf(tab[i]) + String.valueOf(a);

                i=i+a-1;

            }


            System.out.println(tekstShort);
            tekstShort="";
        }

    }
}