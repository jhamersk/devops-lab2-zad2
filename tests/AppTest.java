import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class AppTest {

    @Test
    public void testSortNumbers() {
        int[] input = { 3, 1, 2 };
        int[] expected = { 1, 2, 3 };
        int[] result = App.sortNumbers(input);

        assertArrayEquals(expected, result);
    }
}
