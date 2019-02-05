package SPOJ;

import java.util.Scanner;

public class StringMerge {

    public static String mergeChar(String tekst_1, String tekst_2){
        String txt = "";
        int length = 0;
        int count = 0;
        if (tekst_1.length()>tekst_2.length()) { length = tekst_2.length();} else {length = tekst_1.length();}
        count = length *2-1;
        for (int i = 0; i <length ; i++) {
            txt = txt + tekst_1.charAt(i) + tekst_2.charAt(i);
        }
        return txt;
    }

    public static void main(String[] args) {
        String[] tab;
        Scanner nw = new Scanner(System.in);
        int test = Integer.parseInt(nw.nextLine());
        for (int i = 0; i <test ; i++) {
            String pro = nw.nextLine();
            tab = pro.split(" ");
            System.out.println(mergeChar(tab[0],tab[1]));
        }
    }
}
