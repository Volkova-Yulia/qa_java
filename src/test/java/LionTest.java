import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline mockFeline;

    @Test (expected = Exception.class)
    public void invalidSexThrowsError() throws Exception {
        new Lion("Неизвестно", mockFeline);
    }

    @Test
    public void getKittensReturnsValueFromFeline() throws Exception {
        Lion lion = new Lion("Самец", mockFeline);
        when(mockFeline.getKittens()).thenReturn(1);
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getFoodReturnsValueFromFeline() throws Exception {
        Lion lion = new Lion("Самец", mockFeline);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        when(mockFeline.getFood("Хищник")).thenReturn(expected);
        assertEquals(expected, lion.getFood());
    }
}
