import com.santander.mockito.Domain.AdressData;
import com.santander.mockito.Domain.Person;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PersonAdressTest {

    @Mock
    private AdressData adressData;

    @InjectMocks
    private Person person;


}


