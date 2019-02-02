package SPOJ;

public class Liczby {

    private int znak;
    private int spacja;
    private int liczba;

    public Liczby() {

        }

    public void setZnak()  {
        this.znak += 1;
    }

    public void setSpacja() {
        this.spacja += 1;
    }

    public void setLiczba() {
        this.liczba += 1;
    }

    @Override
    public String toString() {
        return "Liczby{" +
                "znak=" + znak +
                ", spacja=" + spacja +
                ", liczba=" + liczba +
                '}';
    }
}
