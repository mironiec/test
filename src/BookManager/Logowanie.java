package BookManager;

import java.util.LinkedList;
import java.util.Scanner;

public class Logowanie  {
    private static String mail;
    private static String haslo;
    private static Users active_User;

    static Scanner nw = new Scanner(System.in);

    public Logowanie() {
    }

    public static void Dodaj_user(LinkedList<Users> lista_User) throws CloneNotSupportedException{
        Interface inter = new Interface();
        System.out.println("Witaj");
        System.out.println("Wybrałeś opcję rejestracja nowego użytkownika");
        System.out.println("Podaj imię ");
        Users user = new Users();
        user.setName(nw.nextLine());
        System.out.println("Podaj haslo");
        user.setHaslo(nw.nextLine());
        System.out.println("Podaj e-mail");
        user.setEmail(nw.nextLine());
        System.out.println("Dziękuję za rejestracje " + user.getName());
        lista_User.add(user);
        System.out.println("Zaloguj się");
        Interface.EkranPowitalny_NotLogged();
    }


    public static boolean sprawdz_User(LinkedList<Users> lista, String mail, String haslo) {
        for (Users user:lista) {
            if ((user.getEmail().equals(mail) && (user.getHaslo().equals(haslo)))) {
                active_User = user;
                return true;
            }

        }
        return false;
    }

    public static void login(LinkedList<Users> lista_User) throws CloneNotSupportedException{
        System.out.println("Witaj w bibliotece Bydgoskiej");
        System.out.println("Zaloguj się , aby móc wypożyczyć książkę");
        System.out.println("Podaj e-mail: ");
        mail = nw.nextLine();
        System.out.println("Podaj haslo: ");
        haslo = nw.nextLine();
        if (!sprawdz_User(lista_User,mail,haslo)) {
            System.out.println("Nie prawidłowy e-mail lub hasło");
            login (lista_User);
        }
        Interface.EkranZalogowanyOpcje();

    }


    public static void Logon() {
        System.out.println("Witaj w bibliotece Bydgoskiej");
        System.out.println("Właśnie się wylogowałeś");
        active_User = null;
    }

    public int getActive_User(LinkedList<Users> lista) {
        return lista.indexOf(active_User);
    }

    public void setActive_User(Users active_User) {
        Logowanie.active_User = active_User;
    }
}
