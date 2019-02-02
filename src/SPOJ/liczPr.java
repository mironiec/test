package SPOJ;

public class liczPr {
    Liczby[] Elem = new Liczby[100];
    private int top = 0;

    public liczPr() {
    }

    public Liczby[] getElem() {
        return Elem;
    }

    public void setElem(Liczby[] elem) {
        Elem = elem;
    }

    public int getTop() {
        return top;
    }

    public void setTop(int top) {
        this.top = top;
    }
}
