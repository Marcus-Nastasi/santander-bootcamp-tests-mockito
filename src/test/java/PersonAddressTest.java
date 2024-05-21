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
        Mockito.when(person.getAddressData().getCity()).thenReturn("São Paulo");
        Person person1 = new Person("Josh", "23123123", addressData);
        assertEquals("Josh", person1.getName());
        assertEquals("23123123", person1.getCpf());
        assertEquals("SP", person1.getAddressData().getUf());
        assertEquals("São Paulo", person1.getAddressData().getCity());
    }
}


