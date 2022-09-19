import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;


@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    Feline feline = new Feline();

    @Test(expected = java.lang.Exception.class)
    public void getFoodWithoutParameterThrowException() throws Exception {
        feline.getFood("");
    }

    @Test
    public void eatMeatReturnsListOfFoodForPredators() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void getFamilyReturnsFelineFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensReturns1Kitten() {
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittens1KittenReturnsKittenCount() {
        assertEquals(1, feline.getKittens(1));
    }
}
