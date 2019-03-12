import java.util.List;

public interface ContactRepository {
    List<Contact> getBirthdayContacts(String date);
}
