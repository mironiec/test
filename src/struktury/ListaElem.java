package struktury;

public class ListaElem {

    private int value;
    private ListaElem next;
    private ListaElem prev;

    public ListaElem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListaElem getNext() {
        return next;
    }

    public void setNext(ListaElem next) {
        this.next = next;
    }

    public ListaElem getPrev() {
        return prev;
    }

    public void setPrev(ListaElem prev) {
        this.prev = prev;
    }
}
