import com.santander.mockito.Domain.MessageApp;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class MessageAppTest {

    @Spy
    private MessageApp messageApp;

    @InjectMocks
    List<String> messageList = new ArrayList<>();

    @Test
    void verifyCallingSend() {
        Mockito.verifyNoInteractions(messageApp);
        Assertions.assertTrue(messageApp.getMessage().isEmpty());
        messageApp.addMessage("Hello World");
        Mockito.verify(messageApp).addMessage("Hello World");
        Assertions.assertFalse(messageApp.getMessage().isEmpty());
    }

    @Test
    void verifyMessageAppException() {
        Mockito.doThrow(IllegalArgumentException.class).when(messageApp).getMessage();
        Assertions.assertThrows(IllegalArgumentException.class, () -> messageApp.getMessage());
    }

    @Test
    void testingMessageGetter() {
        messageList.add("Hey logan!");
        messageList.add("Hello Sarah!");
        Mockito.when(messageApp.getMessage()).thenReturn(messageList);
        Assertions.assertEquals("Hello Sarah!", messageApp.getMessage().get(1));
    }
}


