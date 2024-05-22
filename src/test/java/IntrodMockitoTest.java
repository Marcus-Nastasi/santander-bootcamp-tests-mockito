import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class IntrodMockitoTest {

    @Mock
    private List<String> letters;

    @Test
    void getSomething() {
        Mockito.when(letters.getFirst()).thenReturn("B");
        assertEquals("B", letters.getFirst());
    }

    @Test
    void addSomething() {
        Mockito.when(letters.add(anyString())).thenReturn(true);
        Assertions.assertTrue(letters.add("M"));

        Mockito.when(letters.get(0)).thenReturn("M");
        Assertions.assertEquals("M", letters.get(0));
    }
}


