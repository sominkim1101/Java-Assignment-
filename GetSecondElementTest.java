 

import org.junit.Assert;
import org.junit.Test;

public class GetSecondElementTest {


    @Test
    public void testGetSecondElement1() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String expected = "man";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSecondElement2() {
        String[] array = { "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String expected = "of";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSecondElement3() {
        String[] array = {"brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String expected = "fox";
        String actual = StringArrayUtils.getSecondElement(array);
        Assert.assertEquals(expected, actual);
    }
}
