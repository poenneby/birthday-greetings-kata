import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;
import static java.util.Collections.emptyList;

public class GetBirthdayInMemoryContactRepositoryTest extends GetBirthdayContactsContract {
    @Override
    protected ContactRepository contactRepositoryWith(Contact contact) {
        return new InMemoryContactRepository(asList(contact));
    }

    @Override
    protected ContactRepository emptyContactRepository() {
        return new InMemoryContactRepository(emptyList());
    }
}
