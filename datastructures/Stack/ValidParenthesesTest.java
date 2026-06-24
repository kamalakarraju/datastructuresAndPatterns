import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    void testValidParentheses() {
        ValidParentheses vp = new ValidParentheses();
        assertTrue(vp.isValid("()[]{}"));
        assertFalse(vp.isValid("(]"));
        assertTrue(vp.isValid(""));
    }
}