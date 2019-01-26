package struktury;


import java.util.Arrays;
import java.util.Scanner;

public class zad1 {
    private int[] tablica;
    private int top = 0;

    public void createTable(){
        Scanner nw = new Scanner(System.in);
        System.out.println("Podaj wartość tablicy");
        tablica = new int[Integer.parseInt(nw.nextLine())];


    }

    public void createTable_n(int n){

        tablica = new int[n];


    }

    public void createVolume(){
        Scanner nw = new Scanner(System.in);
        for (int i=0;i<tablica.length;i++) {

            System.out.println("podaj wartość dla top " + top);
            tablica[i] = nw.nextInt();
            top++;
        }
    }

    public boolean numerate(){
        boolean wart = true;
        for (int i = 0; i<tablica.length-1; i++) {
            if (tablica[i] > tablica[i+1] ) continue;
            if (tablica[i] < tablica[i+1]) { wart = false; break;}
        }
        if (wart == true) return true;
        if (wart== false) return false;
        return wart;
    }

    public void add_Table(int[] tab1, int[] tab2){
        createTable_n(tab1.length);
        int[] tab3 = new int[tab1.length];
        for (int i = 0; i<tab1.length;i++) {
            tab3[i] = tab1[i]+tab2[i];
        }
        tablica = tab3;
//        tablica = Arrays.copyOf(tab3, tab3.length);
    }

    public int[] getTablica() {
        return tablica;
    }

    public zad1() {
    }
}
