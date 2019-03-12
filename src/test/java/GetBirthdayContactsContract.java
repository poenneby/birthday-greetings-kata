import org.junit.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class GetBirthdayContactsContract {

    private static final Contact JOHN = new Contact("john", "john.doe@foobar.com", LocalDate.of(1975, 10, 10));
    private static final String JOHNS_BIRTHDAY = "2018/10/10";
    private static final String NOT_JOHNS_BIRTHDAY = "2018/10/09";

    @Test
    public void birthdayContactsFound() {
        // Given
        ContactRepository contactRepository = contactRepositoryWith(JOHN);
        // When
        List<Contact> birthdayContacts = contactRepository.getBirthdayContacts(JOHNS_BIRTHDAY);
        // Then
        assertThat(birthdayContacts).containsExactly(JOHN);
    }

    @Test
    public void birthdayContactsNotFound() {
        // Given
        ContactRepository contactRepository = emptyContactRepository();
        // When
        List<Contact> birthdayContacts = contactRepository.getBirthdayContacts(NOT_JOHNS_BIRTHDAY);
        // Then
        assertThat(birthdayContacts).isEmpty();
    }

    protected abstract ContactRepository contactRepositoryWith(Contact contact);

    protected abstract ContactRepository emptyContactRepository();
}

