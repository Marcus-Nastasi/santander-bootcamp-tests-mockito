import com.santander.mockito.Domain.AddressData;
import com.santander.mockito.Domain.Person;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class PersonAddressTest {

    @Mock
    private AddressData addressData;

    @InjectMocks
    private Person person;

    @Test
    void mockingAddressObject() {
        Mockito.when(person.getAddressData().getUf()).thenReturn("SP");
        Person person1 = new Person("Josh", "23123123", addressData);
        assertEquals("SP", person1.getAddressData().getUf());
    }
}


