package GRY;

public class Gra {

    private int liczba;  // wylosowana liczba całkowita
    private int count;   // ilość prób użytkownika

    public Gra() {
        this.liczba = (int)(Math.random()*100);
        this.count = 0;
    }

    public int getLiczba() {
        return liczba;
    }



    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
