package struktury.obiekty;

public class infor extends Osoby {
    private int miesiac;

    public int getMiesiac() {
        return miesiac;
    }

    public void setMiesiac(int miesiac) {
        this.miesiac = miesiac;
    }

    @Override
    public String toString() {
        return "infor{" +
                "miesiac=" + miesiac +
                "} " + super.toString();
    }
}
