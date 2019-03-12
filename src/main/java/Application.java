import java.time.LocalDate;

import static java.util.Arrays.asList;

public class Application {
    public static void main(String... args) {
        Contact ann = new Contact("Ann", "ann.doe@foobar.com", LocalDate.of(1985, 11, 8));
        Contact mike = new Contact("Mike", "mike.doe@foobar.com", LocalDate.of(1981, 11, 8));
        Contact john = new Contact("John", "john.doe@foobar.com", LocalDate.of(1982, 10, 8));
        Contact jane = new Contact("Jane", "jane.doe@foobar.com", LocalDate.of(1985, 9, 9));
        new GreetingService(new InMemoryContactRepository(asList(ann, john, jane, mike)), new ConsoleGreetingSender()).greet(args[0]);
    }
}
