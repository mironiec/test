package BookManager;


import java.util.LinkedList;

public class BookManager {
    static LinkedList<Books> listaKsiazek = new LinkedList<Books>();
    static LinkedList<Users> listaUsers = new LinkedList<Users>();




    public static void printB(LinkedList<Books> lista){
        for (Books ksiazki:lista) {
            System.out.println(ksiazki);
        }
    }

    public static void printU(LinkedList<Users> lista){
        for (Users user:lista) {
            System.out.println(user);
        }
    }
    public static void main(String[] args) throws CloneNotSupportedException {

        Books books = new Books("Noemi","Tłumaczenia", 3);
        listaKsiazek.add(books);
        Books books2 = new Books("Noemi","Egzaminy przysięgłe", 6);
        listaKsiazek.add(books2);
        Books books3 = new Books("Mirek","Java", 3);
        listaKsiazek.add(books3);
        Books books4 = new Books("Mirek","Java i ksiązki", 5);
        listaKsiazek.add(books4);
        Interface.EkranPowitalny_NotLogged();


    }
}
