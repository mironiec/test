package BookManager;


import java.util.LinkedList;

public class BookManager {
    static LinkedList<Books> lista = new LinkedList<Books>();
    static LinkedList<Users> users = new LinkedList<Users>();

    public static void oddaj(Users uzytkownik, Books books) {
        for (Users user : users) {
            if (user.getId() == uzytkownik.getId()) user.setOddane(books);
        }
    }
    public static void wypozycz(Users uzytkownik, Books books) throws CloneNotSupportedException{
        for (Users user:users) {
            if (user.getId()==uzytkownik.getId()) user.setWypozyczone(books);
        }
    }

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

        //Books books = new Books("Noemi","Tłumaczenia", 3);
        //lista.add(books);
        Books books2 = new Books("Noemi","Egzaminy przysięgłe", 6);
        lista.add(books2);
        Books books3 = new Books("Mirek","Java", 3);
        lista.add(books3);
        //Books books4 = new Books("Mirek","Java i ksiązki", 5);
        //lista.add(books4);

        Users user = new Users("Mirik",1);
        users.add(user);
        printU(users);
        wypozycz(user,books3);
        printB(lista);
        printU(users);
        oddaj(user,books3);
        printB(lista);
        printU(users);
        wypozycz(user,books3);
        wypozycz(user,books2);
        printU(users);
        printB(lista);
        oddaj(user,books3);
        printU(users);
        printB(lista);
        oddaj(user,books2);
        printU(users);
        printB(lista);
    }
}
