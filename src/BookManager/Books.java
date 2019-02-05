package BookManager;

public class Books implements Cloneable{
    private String Autor;
    private String Tytul;
    private int ilość;

    public Books(String autor, String tytul, int ilość) {
        Autor = autor;
        Tytul = tytul;
        this.ilość = ilość;
    }

    public Books() {
    }

    public String getAutor() {
        return Autor;
    }

    public String getTytul() {
        return Tytul;
    }

    public int getIlość() {
        return ilość;
    }

    public void setIlość(int ilość) {
        this.ilość = ilość;
    }
    @Override
    public Books clone() throws CloneNotSupportedException {
        return (Books) super.clone();
    }

    @Override
    public String toString() {
        return "Books{" +
                "Autor='" + Autor + '\'' +
                ", Tytul='" + Tytul + '\'' +
                ", ilość=" + ilość +
                '}';
    }
}
