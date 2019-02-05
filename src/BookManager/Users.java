package BookManager;

import java.util.LinkedList;

public class Users implements Cloneable {

    private String Name;
    private int Id;
    private LinkedList<Books> wypozyczone = new LinkedList<Books>();

    public Users() {
    }

    public Users(String name, int id) {
        Name = name;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public LinkedList<Books> getWypozyczone() {
        return wypozyczone;
    }

    public void setOddane (Books book) {
        for (Books ksiazki: wypozyczone) {
            if (ksiazki.getAutor()==book.getAutor()) {
                wypozyczone.remove(ksiazki);
                book.setIlość(book.getIlość()+1);
            }
        }
    }

    public void setWypozyczone(Books book) throws CloneNotSupportedException {
        Books bo = book.clone();

        bo.setIlość(1);
        this.wypozyczone.add(bo);

        book.setIlość(book.getIlość()-1);
    }

    @Override
    public String toString() {
        return "Users{" +
                "Name='" + Name + '\'' +
                ", Id=" + Id +
                ", wypozyczone=" + wypozyczone +
                '}';
    }
}

