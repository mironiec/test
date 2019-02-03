package struktury.Kopiec;

public class BubbleSort {

    public static void sortujBubble( int[] tab){
        int len = tab.length;

        for (int i = 0; i <len ; i++)
            for (int j = i+1; j<len;j++) {
                if (tab[j] < tab[i]) {
                    int tmp = tab[i];
                    int tmp2 = tab[j];
                    tab[i] = tmp2;
                    tab[j] = tmp;
                }
            }
    }
}
