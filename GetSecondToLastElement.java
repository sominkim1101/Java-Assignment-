 

import org.junit.Assert;
import org.junit.Test;

public class GetSecondToLastElement {

    @Test
    public void testGetSecondToLastElement1() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String expected = "for";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetSecondToLastElement2() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for"};
        String expected = "battle";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testGetSecondToLastElement3() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending"};
        String expected = "a";
        String actual = StringArrayUtils.getSecondToLastElement(array);
        Assert.assertEquals(expected, actual);
    }
}
