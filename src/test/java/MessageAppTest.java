import com.santander.mockito.Domain.MessageApp;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MessageAppTest {

    @Spy
    private MessageApp messageApp;

    @Test
    void verifyCallingSend() {

    }
}


