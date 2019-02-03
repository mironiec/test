package struktury.Kopiec;

import struktury.SortowaniePrzezZliczanie.CountingSort;

import java.util.Arrays;

import static struktury.Kopiec.SortowanieKopiec.sortuj;

public class initKopiec {
    public static int[] tab = new int[] {3,8,2,6,10,7,9,15,4,18};

    public static void wywolaj() {

        Kopiec kopiec = new Kopiec();
        kopiec.run(tab);
        System.out.println(Arrays.toString(tab));

    }

    public static void main(String[] args) {
        wywolaj();
        //new SortowanieKopiec().sortuj(tab);
        //new BubbleSort().sortujBubble(tab);
        System.out.println(Arrays.toString(new CountingSort().sortuj(tab,18)));

    }
}
