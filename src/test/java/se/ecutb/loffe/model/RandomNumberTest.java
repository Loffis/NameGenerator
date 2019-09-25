package se.ecutb.loffe.model;

import org.junit.Assert;
import org.junit.Test;

public class RandomNumberTest {

    @Test
    public void random_get_0(){
        int expected = 0;
        int result = RandomNumber.random(1);

        Assert.assertEquals(expected, result);
    }

    @Test
    public void random_get_0_to_9(){
        int result = RandomNumber.random(10);

        Assert.assertTrue(result >= 0 || result <= 9);
    }

}
