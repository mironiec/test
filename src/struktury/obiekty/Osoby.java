package struktury.obiekty;

public class Osoby {
    private String firstName;
    private String lastName;
    private int wiek;
    private int index;

    public Osoby() {
    }

    public Osoby(String firstName, String lastName, int wiek, int index) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.wiek = wiek;
        this.index = index;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Osoby{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", wiek=" + wiek +
                ", index=" + index +
                '}';
    }
}

