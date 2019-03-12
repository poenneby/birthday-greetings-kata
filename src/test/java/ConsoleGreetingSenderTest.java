import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

public class ConsoleGreetingSenderTest {


    @Test
    public void should_print_email() {
        // Given
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        Contact john = new Contact("John", "john.doe@foobar.com", LocalDate.of(1982, 10, 8));

        // When
        new ConsoleGreetingSender().sendGreetingTo(john);

        // Then
        assertThat(output.toString()).isEqualTo("To: john.doe@foobar.com\n" +
                "Subject: Happy birthday!\n" +
                "\n" +
                "Body:\n" +
                "Happy birthday, dear John!");
    }
}
