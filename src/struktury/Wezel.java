package struktury;

public class Wezel {
    private int wartosc;
    private Wezel lewy;
    private Wezel prawy;

    public Wezel(int wartosc) {
        this.wartosc = wartosc;
        lewy = prawy = null;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public Wezel getLewy() {
        return lewy;
    }

    public void setLewy(Wezel lewy) {
        this.lewy = lewy;
    }

    public Wezel getPrawy() {
        return prawy;
    }

    public void setPrawy(Wezel prawy) {
        this.prawy = prawy;
    }

    @Override
    public String toString() {
        return "Wezel{" +
                "wartosc=" + wartosc +
                ", lewy=" + lewy +
                ", prawy=" + prawy +
                '}';
    }
}
