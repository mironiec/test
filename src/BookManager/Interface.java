package BookManager;

import java.util.Scanner;

public class Interface  {
    static Scanner nw = new Scanner(System.in);
    static BookManager bM = new BookManager();
    static Logowanie log = new Logowanie();

    public static void EkranPowitalny_NotLogged() throws CloneNotSupportedException{
        int wybor = 0;

        System.out.println("Witaj w bibliotece");
        System.out.println("Wybierz Opcje : ");
        System.out.println("1. Nowy Uzytkownik | 2. Zaloguj się | 3 Pokaz Uzytkowników");
        wybor = Integer.parseInt(nw.nextLine());
        if ( wybor == 1 ) Logowanie.Dodaj_user(BookManager.listaUsers);
        if ( wybor == 2 ) Logowanie.login(BookManager.listaUsers);
        if ( wybor == 3 ) {Users.Lista_Users(BookManager.listaUsers); EkranPowitalny_NotLogged();}
        if ((wybor!=1) && (wybor!=2) && (wybor!=3)) EkranPowitalny_NotLogged();
    }

    public static void ZwrocKsiazke() throws CloneNotSupportedException{
        int index  = 0;
        System.out.println("Podaj indeks ksiązki do zwrócenia");
        index = Integer.parseInt(nw.nextLine());
        BookManager.listaUsers.get(log.getActive_User(BookManager.listaUsers)).setOddane(BookManager.listaKsiazek.get(index));
        System.out.println("Dziękujemy za zwrot ksiązki");
        EkranZalogowanyOpcje();
    }

    public static void WypozyczKsiazke() throws CloneNotSupportedException{
        int index  = 0;
        System.out.println("Podaj indeks ksiązki do wypożyczenia");
        index = Integer.parseInt(nw.nextLine());
        BookManager.listaUsers.get(log.getActive_User(BookManager.listaUsers)).setWypozyczone(BookManager.listaKsiazek.get(index));
        System.out.println("Dziękujemy za wypozyczenie książki");
        EkranZalogowanyOpcje();
    }

    public static void ListaDostepnychKsiazek() throws CloneNotSupportedException{
        for (Books book: BookManager.listaKsiazek) {
            System.out.println(book + "Numer indeksu ksiązki aby wypozyczyc  " + BookManager.listaKsiazek.lastIndexOf(book));
        }
        EkranZalogowanyOpcje();
    }

    public static void ListaWypozyczonychKsiązek() throws CloneNotSupportedException{

        for (Users userBook: BookManager.listaUsers) {
            if (userBook.getName().equals(BookManager.listaUsers.get(log.getActive_User(BookManager.listaUsers)).getName())) {
                if (!userBook.getWypozyczone().isEmpty()) {
                    int i = userBook.getWypozyczone().size();
                    for (int j = 0; j < i; j++) {
                        System.out.println("Autor " + userBook.getWypozyczone().get(j).getAutor()
                        + "tYTUŁ" + userBook.getWypozyczone().get(j).getTytul());
                    }

                }
            }
        }
        EkranZalogowanyOpcje();
    }

    public static void EkranZalogowanyOpcje() throws CloneNotSupportedException{
        int wybor = 0;
        System.out.println("Witaj użytkowniku " + BookManager.listaUsers.get(log.getActive_User(BookManager.listaUsers)).getName());
        System.out.println("Wybierz Opcje które Cię interesują : ");
        System.out.println("1. Lista dostępnych książek | 2. Lista wypożyczonych książek | 3. Zwróć Książkę | 4 Wypożyc książke | 5 Wyloguj sie");
        wybor = Integer.parseInt(nw.nextLine());
        switch (wybor) {
            case 1:
                ListaDostepnychKsiazek();
                break;
            case 2:
                ListaWypozyczonychKsiązek();
                break;
            case 3:
                ZwrocKsiazke();
                break;
            case 4:
                WypozyczKsiazke();
                break;
            case 5:
                Logowanie.Logon();
                EkranPowitalny_NotLogged();

        }
    }
}
