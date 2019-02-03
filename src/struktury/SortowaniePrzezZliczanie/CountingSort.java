package struktury.SortowaniePrzezZliczanie;

public class CountingSort {

    public  int[] sortuj(int[] tab, int max) {
        int[] count = new int[max+1];
        int[] output = new int[tab.length];

        for (int i = 0; i < tab.length; i++) {
            count[tab[i]]++;                // int a = tab[i] ; count[a] ++;
        }
        for (int i = 1; i <count.length ; i++) {
            count[i] = count[i] + count[i-1];   //count[i] += count[i-1]

        }
        for (int i = 0; i < tab.length; i++) {
            output[count[tab[i]]-1] = tab[i];
            count[tab[i]]--;        // count[tab[i]]= count[tab[i]] - 1

        }
        return output;
    }


}
