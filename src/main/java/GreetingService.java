import java.util.List;

public class GreetingService {
    private final ContactRepository contactRepository;
    private final GreetingSender greetingSender;

    public GreetingService(ContactRepository contactRepository, GreetingSender greetingSender) {
        this.contactRepository = contactRepository;
        this.greetingSender = greetingSender;
    }

    public void greet(String date) {
        List<Contact> birthdayContacts = contactRepository.getBirthdayContacts(date);
        birthdayContacts.forEach(contact -> greetingSender.sendGreetingTo(contact));
    }
}
