import struktury.ListaKolejka;

public class main {

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

    public static void main(String[] args) {
        initLista();

    }
}
