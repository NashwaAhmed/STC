import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ReverseSubstringTest {

    @Test
    public void testReverseStringSwap() {
        assertEquals(ReverseSubstring.reverseInput(new InputModel("dd(df)a(ghhh)")), "dd(fd)a(hhhg)");
        assertNotEquals(ReverseSubstring.reverseInput(new InputModel("abcd")), "dcbb");
        assertEquals(ReverseSubstring.reverseInput(new InputModel("abd(jnb)asdf")), "abd(bnj)asdf");
        assertEquals(ReverseSubstring.reverseInput(new InputModel("abdjnbasdf")), "abdjnbasdf");
    }

}
