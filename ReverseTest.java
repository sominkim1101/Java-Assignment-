 

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by super-yang on 03/05/2020.
 */

public class ReverseTest {

    @Test
    public void testReverse1() {
        String[] array = {"Superman", "was", "born", "on", "the", "Keypton", "and", "his", "name","was","Kal-El"};
        String[] expected = {"Kal-El", "was", "name", "his", "and", "Keypton", "the", "on", "born","was","Superman"};
        String[] actual = StringArrayUtils.reverse(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverse2() {
        String[] array  = {"truth","for","battle", "never-ending", "a", "fights", "steel", "of", "man", "the"};
        String[] expected = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String[] actual = StringArrayUtils.reverse(array);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverse3() {
        String[] expected = {"the", "man", "of", "steel", "fights", "a", "never-ending", "battle", "for","truth"};
        String[] actual = StringArrayUtils.reverse(StringArrayUtils.reverse(expected));
        Assert.assertEquals(expected, actual);
    }



}
