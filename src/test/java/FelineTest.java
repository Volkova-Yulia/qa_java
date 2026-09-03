import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {

    @Test
    public void returnFelineFamily() {
        Feline feline = new Feline();
        String family = "Кошачьи";
        assertEquals(family, feline.getFamily());
    }

    @Test
    public void eatMeatIsMeat() throws Exception {
        Feline feline = new Feline();
        List<String> foodFofFeline = List.of("Животные", "Птицы", "Рыба");
        assertEquals(foodFofFeline, feline.eatMeat());
    }

    @Test
    public void getKittensShouldReturnOneKitten() {
        Feline feline = new Feline();
        assertEquals(1, feline.getKittens());
    }
    @Test //тест 2 метода getKittens() с определенным кол-вом котят
    public void getKittensWithDifferentCount() {
        Feline feline = new Feline();
        assertEquals(6, feline.getKittens(6));
    }
}
