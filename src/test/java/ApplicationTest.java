import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.assertj.core.api.Assertions.assertThat;

public class ApplicationTest {

    @Test
    public void should_greet_john_on_his_birthday() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Application.main("2018/10/08");

        assertThat(output.toString()).isEqualTo("To: john.doe@foobar.com\n" +
                "Subject: Happy birthday!\n" +
                "\n" +
                "Body:\n" +
                "Happy birthday, dear John!");
    }
}
