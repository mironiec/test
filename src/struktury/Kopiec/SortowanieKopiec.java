package struktury.Kopiec;

public class SortowanieKopiec {

    public static void sortuj(int[] tab) {
        int L = tab.length;


        for (int i = 0; i < L - 1; i++)
            for (int j = i + 1; j < L; j++) {
                if (tab[j] < tab[i]) {
                    int tmp = tab[i];
                    int tmp2 = tab[j];
                    tab[i] = tmp2;
                    tab[j] = tmp;

                }
            }
    }
}

