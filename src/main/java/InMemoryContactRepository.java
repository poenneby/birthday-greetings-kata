import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toList;

public class InMemoryContactRepository implements ContactRepository {

    private final List<Contact> contacts;

    public InMemoryContactRepository(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public List<Contact> getBirthdayContacts(String date) {
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        return contacts.stream().filter(contact -> isBirthday(contact, localDate)).collect(toList());
    }

    private boolean isBirthday(Contact contact, LocalDate localDate) {
        return contact.birthday.getMonth().equals(localDate.getMonth()) && contact.birthday.getDayOfMonth() == localDate.getDayOfMonth();
    }
}
