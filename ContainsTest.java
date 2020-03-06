 

import org.junit.Assert;
import org.junit.Test;

public class ContainsTest {

    @Test
    public void testContains() {
        String[] array = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        for (String s : array) {
            boolean outcome = StringArrayUtils.contains(array, s);
            Assert.assertTrue(outcome);
        }
    }
}
