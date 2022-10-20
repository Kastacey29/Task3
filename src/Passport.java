import java.util.Objects;

public class Passport {
    private final int number;
    private  String name;
    private  String surname;
    private  String lastname;
    private  int dateOfBirth;

    public Passport(int number, String name, String surname, String lastname, int date) {
        this.number = number;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.dateOfBirth = date;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getDate() {
        return dateOfBirth;
    }

    public void setDate(int date) {
        this.dateOfBirth = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Passport)) return false;
        Passport passport = (Passport) o;
        return number == passport.number && dateOfBirth == passport.dateOfBirth && Objects.equals(name, passport.name) && Objects.equals(surname, passport.surname) && Objects.equals(lastname, passport.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, surname, lastname, dateOfBirth);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
