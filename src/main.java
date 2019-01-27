import struktury.BinarySearch;
import struktury.ListaKolejka;
import struktury.zad1;

public class main {

    public static int[] tablica = new int[10];

    public static void initLista(){
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

    public static void initTable(){
        zad1 zad = new zad1();
        zad.createTable();
        zad.createVolume();
        System.out.println(zad.numerate());

    }

    public static void InitTable2(){
        zad1 zad = new zad1();
        zad1 zad2 = new zad1();
        zad1 zad3 = new zad1();
        zad.createTable();
        zad.createVolume();
        zad2.createTable();
        zad2.createVolume();
        zad3.add_Table(zad.getTablica(),zad2.getTablica());
        for(int e : zad3.getTablica()) {
        System.out.print(e + " ");}
    }

    public static void InitBinary(int[] tablica){
        BinarySearch bin = new BinarySearch(tablica,5);
        System.out.println(bin.szukaj());
    }

    public static void main(String[] args) {

        for (int i=0;i<tablica.length;i++) tablica[i] = i;

        InitBinary(tablica);

    }
}
