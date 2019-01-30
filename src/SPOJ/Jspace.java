package SPOJ;

import java.util.Scanner;

public class Jspace {
    public static Scanner nw = new Scanner(System.in);

    public static String zmien(String tekst) {
        String tex = "";
        String[] txt = tekst.split(" ");
        for(int i=0; i<txt.length;i++) {
            txt[i] = txt[i].replace(txt[i].charAt(0),txt[i].toUpperCase().charAt(0));
        }
        for (String e:txt) {
            tex = tex+e;
        }
        return tex;
    }
    public static void main(String[] args) {
        String linia;
        while (nw.hasNextLine()) {
           linia = nw.nextLine();
            System.out.println(zmien(linia));
    }
    }
}
