package se.ecutb.loffe.data;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class NameServiceTest {

    NameService testObject;

    @Before
    public void setup() {
        testObject = new NameService();
    }

    @Test
    public void pojknamn_txt_successfully_read(){
        int expected = 19499;
        List<String> result = testObject.maleFirstName();

        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void flicknamn_txt_successfully_read(){
        int expected = 19391;
        List<String> result = testObject.femaleFirstName();

        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void efternamn_txt_successfully_read(){
        int expected = 100;
        List<String> result = testObject.lastName();

        Assert.assertEquals(expected, result.size());
    }

    @Test
    public void get_random_male_name(){
        String result = testObject.getRandomMaleName();

        Assert.assertNotNull(result);
    }

    @Test
    public void get_random_female_name(){
        String result = testObject.getRandomFemaleName();

        Assert.assertNotNull(result);
    }

    @Test
    public void get_random_last_name(){
        String result = testObject.getRandomLastName();

        Assert.assertNotNull(result);
    }

    @Test
    public void get_multiple_random_names(){
        int numberOfNames = 2;

        Assert.assertNotNull(testObject.getMultipleRandomNames(numberOfNames));
        Assert.assertEquals(numberOfNames, testObject.getMultipleRandomNames(numberOfNames).size());
    }

    @Test
    public void get_random_male_first_and_last_name(){

        Assert.assertNotNull(testObject.getMaleFirstAndLastName());

    }

    @Test
    public void get_random_female_first_and_last_name(){

        Assert.assertNotNull(testObject.getFemaleFirstAndLastName());

    }



}
