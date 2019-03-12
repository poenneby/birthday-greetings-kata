import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.Arrays;

import static org.mockito.Mockito.*;
import static org.mockito.Mockito.verify;

public class GreetingServiceTest {

    @Test
    public void should_send_greeting_to_john() {
        // Given
        ContactRepository contactRepository = mock(ContactRepository.class);
        GreetingSender greetingSender = mock(GreetingSender.class);
        String date = "2018/10/08";
        Contact john = new Contact("John", "john.doe@foobar.com", LocalDate.of(1982, 10, 8));

        when(contactRepository.getBirthdayContacts(date)).thenReturn(Arrays.asList(john));

        // When
        new GreetingService(contactRepository, greetingSender).greet(date);

        // Then
        verify(contactRepository).getBirthdayContacts(date);
        verify(greetingSender).sendGreetingTo(john);
    }

    @Test
    public void should_send_greeting_to_john_and_mary() {
        // Given
        ContactRepository contactRepository = mock(ContactRepository.class);
        GreetingSender greetingSender = mock(GreetingSender.class);
        String date = "2018/10/08";
        Contact mary = new Contact("Ann", "ann.doe@foobar.com", LocalDate.of(1985, 10, 8));
        Contact john = new Contact("John", "john.doe@foobar.com", LocalDate.of(1982, 10, 8));

        when(contactRepository.getBirthdayContacts(date)).thenReturn(Arrays.asList(john, mary));

        // When
        new GreetingService(contactRepository, greetingSender).greet(date);

        // Then
        verify(contactRepository).getBirthdayContacts(date);
        verify(greetingSender).sendGreetingTo(john);
        verify(greetingSender).sendGreetingTo(mary);
    }
}
