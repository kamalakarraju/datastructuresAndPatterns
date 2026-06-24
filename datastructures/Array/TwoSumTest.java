import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void testTwoSum() {
        TwoSum solution = new TwoSum();
        assertArrayEquals(new int[]{0,1}, solution.twoSum(new int[]{2,7,11,15}, 9));
    }
}