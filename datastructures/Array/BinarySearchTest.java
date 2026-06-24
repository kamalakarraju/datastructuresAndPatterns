import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void testBinarySearch() {
        BinarySearch bs = new BinarySearch();
        assertEquals(4, bs.search(new int[]{-1,0,3,5,9,12}, 9));
        assertEquals(-1, bs.search(new int[]{-1,0,3,5,9,12}, 2));
    }
}