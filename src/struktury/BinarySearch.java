package struktury;

public class BinarySearch {

    private  static int[] tablica;
    private  static int lewo = 0;
    private  static int prawo = 0;
    private static int value;
    private static String czy_jest;
    private static int indeks;

    public static String szukaj() {
        prawo = tablica.length-1;
        while (lewo < prawo) {
            int srodek = (lewo + prawo) / 2;
            if (tablica[srodek] < value) {
                lewo = srodek + 1;
            } else prawo = srodek;
        }
        if (tablica[lewo] == value) indeks = lewo;
        else indeks = -1;
        if (indeks == lewo) czy_jest = String.valueOf(indeks);
        if (indeks == -1) czy_jest = "Brak";
        return czy_jest;
    }


    public BinarySearch(int[] tablica,int value ) {
        this.tablica = tablica;
        this.value = value;
    }

    public BinarySearch() {
    }

    public void setTablica(int[] tablica) {
        this.tablica = tablica;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
