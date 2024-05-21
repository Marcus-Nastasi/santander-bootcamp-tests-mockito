import com.santander.mockito.Domain.MessageApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class MessageAppTest {

    @Spy
    private MessageApp messageApp;

    @Test
    void verifyCallingSend() {
        Mockito.verifyNoInteractions(messageApp);
        Assertions.assertTrue(messageApp.getMessage().isEmpty());
        messageApp.addMessage("Hello World");
        Mockito.verify(messageApp).addMessage("Hello World");
        Assertions.assertFalse(messageApp.getMessage().isEmpty());
    }
}


