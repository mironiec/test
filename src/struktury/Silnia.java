package struktury;

public class Silnia {

    public int rekurencja(int n) {
        if (n ==0) return 1;
        if (n ==1) return 1;
        return n * rekurencja(n-1);
    }


}
