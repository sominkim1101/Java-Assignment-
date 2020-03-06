 

import org.junit.Assert;
import org.junit.Test;

public class RemoveValueTest {

    @Test
    public void testRemoveValue() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String[] expected = {"man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String[] actual = StringArrayUtils.removeValue(array, "the");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue1() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String[] expected = {"the", "man", "of", "fights", "a", "never-ending", "battle", "for","truth"};
        String[] actual = StringArrayUtils.removeValue(array, "steel");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemoveValue2() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String[] expected = {"the", "man", "of", "steel", "fights", "a", "battle", "for","truth"};
        String[] actual = StringArrayUtils.removeValue(array, "never-ending");
        Assert.assertEquals(expected, actual);
    }
}
