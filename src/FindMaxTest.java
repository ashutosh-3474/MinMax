import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FindMaxTest {
    @Test
    public void givenMaxAtFirstPosition_ShouldReturnSame() {
        Integer result = FindMax.findMax(9, 3, 2);
        assertEquals(Integer.valueOf(9), result);
    }

    // TC 1.2: Max at 2nd position
    @Test
    public void givenMaxAtSecondPosition_ShouldReturnSame() {
        Integer result = FindMax.findMax(3, 9, 2);
        assertEquals(Integer.valueOf(9), result);
    }

    // TC 1.3: Max at 3rd position
    @Test
    public void givenMaxAtThirdPosition_ShouldReturnSame() {
        Integer result = FindMax.findMax(3, 2, 9);
        assertEquals(Integer.valueOf(9), result);
    }

}