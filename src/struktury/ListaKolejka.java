package struktury;

public class ListaKolejka {
    private ListaElem first;
    private ListaElem last;

    public ListaKolejka() {
        first = last = null;
    }

    public void addLast(int value){
        ListaElem elem = new ListaElem(value);


        if(last == null) {
            first = last = elem;
        } else {
            elem.setPrev(last);
            elem.setNext(null);
            last.setNext(elem);
            last = elem;
        }
    }

    public void addFirst(int value){
        ListaElem elem = new ListaElem(value);

        if (first==null) {
            first = elem;
            last = elem;
        } else {
        elem.setNext((first));
        elem.setPrev(null);
        first.setPrev(elem);
        first = elem;
        }
    }

    public int peekFirst() {
        if (isEmpty()) {
        }

        return first.getValue();
    }
    public int peekLast() {
        if (isEmpty()) {
        }

        return last.getValue();
    }

   public int pollFist() {
       if(isEmpty()) {
           //TODO exception
       }

       int value = first.getValue();

       if(first.getNext() == null) {
           first = last = null;
       } else {
           first = first.getNext();
           first.setPrev(null);
       }

       return value;
   }

   public int pollLast() {
        if (isEmpty()) {

        }
        int value = last.getValue();
        if(last.getPrev()==null) {
            first = last = null;
        } else {
        last = last.getPrev();
        last.setNext(null);

        }
        return  value;
    }

    public boolean isEmpty() {
        return first== null;
    }

    public boolean czyZnajduje(int value) {
        ListaElem tmp = first;
        while (tmp!=null) {
            if (value == tmp.getValue()) return true;
            tmp = tmp.getNext();
        }
        return false;
    }

    public void usun(int value){
        ListaElem tmp = first;
        while (tmp!=null) {
            if (value ==first.getValue()) {
                pollFist();
            } else if(value==last.getValue()) {
                pollLast();
            }else if (value ==tmp.getValue()) {
                    tmp.getPrev().setNext(tmp.getNext());
                    tmp.getNext().setPrev(tmp.getPrev());
                    
            }
                tmp = tmp.getNext();
            }
        }


    public  void print(){
        ListaElem tmp = first;
        while (tmp!=null) {
            System.out.print(tmp.getValue()+ " ");
            tmp = tmp.getNext();
        }
        System.out.println("kolejny obiekt");
    }

}
