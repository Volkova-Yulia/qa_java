import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)

public class CatTest {
    @Mock
    private Feline mockFeline;

    @Test
    public void testCatGetSound() {
        Cat cat = new Cat(mockFeline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void catEatMeat() throws Exception {
        Cat cat = new Cat(mockFeline);
        List<String> catEat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(mockFeline.eatMeat()).thenReturn(catEat);
        assertEquals(catEat, cat.getFood());
    }
}