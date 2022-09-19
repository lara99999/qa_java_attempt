import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private boolean expected;
    private String sex;
    private static Feline feline;

    public LionParameterizedTest(String sex, Feline feline, boolean expected) {
        this.sex = sex;
        this.feline = feline;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getMane() {
        return new Object[][] {
                {"Самец", feline, true},
                {"Самка", feline, false},
        };
    }

    @Test
    public void doesHaveManeReturnTrueIfLionHasMane() throws Exception {
        Lion lion = new Lion(sex, feline);
        assertEquals(expected, lion.doesHaveMane());
    }
}