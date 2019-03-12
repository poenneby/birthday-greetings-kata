import java.time.LocalDate;
import java.util.Objects;

public class Contact {
    final String firstName;
    final String email;
    protected final LocalDate birthday;

    public Contact(String firstName, String email, LocalDate birthday) {
        this.firstName = firstName;
        this.email = email;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", birthday='" + birthday + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(firstName, contact.firstName) &&
                Objects.equals(email, contact.email) &&
                Objects.equals(birthday, contact.birthday);
    }

    @Override
    public int hashCode() {

        return Objects.hash(firstName, email, birthday);
    }
}

