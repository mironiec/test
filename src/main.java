import struktury.BinarySearch;
import struktury.ListaKolejka;
import struktury.Sito;
import struktury.zad1;

public class main {

    public static int[] tablica = new int[10];


    public static void initLista() {
        ListaKolejka lista = new ListaKolejka();
        lista.addFirst(1);
        lista.addFirst(123);
        lista.addFirst(334);
        lista.addLast(2);
        lista.addLast(6667);
        lista.print();
        System.out.println(lista.czyZnajduje(0));
        lista.usun(123);
        lista.print();
    }

    public static void initTable() {
        zad1 zad = new zad1();
        zad.createTable();
        zad.createVolume();
        System.out.println(zad.numerate());

    }

    public static void InitTable2() {
        zad1 zad = new zad1();
        zad1 zad2 = new zad1();
        zad1 zad3 = new zad1();
        zad.createTable();
        zad.createVolume();
        zad2.createTable();
        zad2.createVolume();
        zad3.add_Table(zad.getTablica(), zad2.getTablica());
        for (int e : zad3.getTablica()) {
            System.out.print(e + " ");
        }
    }

    public static void InitBinary(int[] tablica) {
        long start;
        long stop;

        start = System.nanoTime();

        BinarySearch bin = new BinarySearch(tablica, 1);
        stop = System.nanoTime();
        System.out.println(bin.szukaj());

        //stop = System.nanoTime();

        System.out.println("czas: " + (stop - start));

        start = System.nanoTime();

        BinarySearch binTest = new BinarySearch();
        binTest.setTablica(tablica);
        binTest.setValue(1);
        stop = System.nanoTime();
        System.out.println(binTest.szukaj());

        //stop = System.nanoTime();

        System.out.println("czas: " + (stop - start));
    }


    public static void initSito(){
        Sito sito = new Sito(100);
        sito.szukaj();

        sito.print();
    }

    public static void main(String[] args) {


        initSito();

    }
}
