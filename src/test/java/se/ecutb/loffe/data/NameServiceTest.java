package se.ecutb.loffe.data;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NameServiceTest {

    @Test
    public void pojknamn_txt_successfully_read(){
        NameService testObject = new NameService();
        int expected = 19499;
        List<String> result = testObject.maleFirstName();

        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void flicknamn_txt_successfully_read(){
        NameService testObject = new NameService();
        int expected = 19391;
        List<String> result = testObject.femaleFirstName();

        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void efternamn_txt_successfully_read(){
        NameService testObject = new NameService();
        int expected = 100;
        List<String> result = testObject.lastName();

        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void get_random_male_name(){
        NameService testObject = new NameService();
        String result = testObject.getRandomMaleName();

        Assert.assertNotNull(result);
    }

    @Test
    public void get_random_female_name(){
        NameService testObject = new NameService();
        String result = testObject.getRandomFemaleName();

        Assert.assertNotNull(result);
    }

    @Test
    public void get_random_last_name(){
        NameService testObject = new NameService();
        String result = testObject.getRandomLastName();

        Assert.assertNotNull(result);
    }


}
