import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class IntrodMockitoTest {

    @Mock
    private List<String> letters;

    @Test
    void addSomething() {
        Mockito.when(letters.getFirst()).thenReturn("B");
        assertEquals("B", letters.getFirst());
    }
}


