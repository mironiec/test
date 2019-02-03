package struktury.obiekty;

import java.util.Arrays;
import java.util.LinkedList;

public class initOsoby {
    public static LinkedList<infor> lista = new LinkedList<>();
    public static int index = 0;


    public static void usun(String imie) {
        int indeks = 0;
        for (infor osoba: lista) {
            if (osoba.getFirstName().equals(imie)) indeks = lista.indexOf(osoba);
        }
        lista.remove(indeks);

        System.out.println(indeks);
    }



    public static void addOsobe(String imie, String nazwisko, int wiek,int miesiac){
        infor osoby = new infor();
        osoby.setFirstName(imie);
        osoby.setLastName(nazwisko);
        osoby.setWiek(wiek);
        osoby.setMiesiac(miesiac);
        lista.add(osoby);

        System.out.println("Nr indeksu osoby to " + lista.indexOf(osoby));
        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println(lista);
        addOsobe("M....","N.....",39,01);
        System.out.println((lista));
        addOsobe("N....","G.....",33,12);
        System.out.println("cos " +lista.toArray().length);
        System.out.println(lista);
        System.out.println("indeks " + lista.get(1).getFirstName().replace(lista.get(1).getFirstName(),"Noemisia"));
        System.out.println("oo %%d" +lista.get(0).getIndex());
        System.out.println(lista);


    }

}
