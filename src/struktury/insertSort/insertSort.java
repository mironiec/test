package struktury.insertSort;

public class insertSort {
    public int[] sortuj(int[] tab) {

        for (int i = 0; i < tab.length ; i++) {
            for (int j = i; j >0  ; j--) {
                if(tab[j]<tab[j-1]) {
                    int t = tab[j-1];
                    tab[j-1] =tab[j];
                    tab[j] = t;
                } else {break;}
            }
        }
        return tab;
    }
}
