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

    @Test
    public void get_random_female_or_male_first_and_last_name(){
        // gender = 0 ger kille
        // gender = 1 ger tjej
        // gender > 1 ger random

        Assert.assertNotNull(testObject.getRandomMaleOrFemaleFirstAndLastName(0));
        Assert.assertNotNull(testObject.getRandomMaleOrFemaleFirstAndLastName(1));
        Assert.assertNotNull(testObject.getRandomMaleOrFemaleFirstAndLastName(9));

    }

    @Test
    public void get_multiple_random_male_first_name_with_fixed_last_name(){
        int amountOfNames = 3;
        int expected = 3;
        String lastname = "Jsson";

        Assert.assertEquals(expected,
                testObject.getMultipleRandomMaleNamesWithFixedLastName(lastname, amountOfNames).size());

    }

    @Test
    public void get_multiple_random_female_first_name_with_fixed_last_name(){
        int amountOfNames = 3;
        int expected = 3;
        String lastname = "Jsson";

        Assert.assertEquals(expected,
                testObject.getMultipleRandomFemaleNamesWithFixedLastName(lastname, amountOfNames).size());

    }

    @Test
    public void get_male_name_by_first_letter(){
        char startsWith = 'V';
        String expected = "V";

        Assert.assertTrue(testObject.getMaleNameByFirstLetter(startsWith).startsWith(expected));
    }

    @Test
    public void get_female_name_by_first_letter(){
        char startsWith = 'C';
        String expected = "C";

        Assert.assertTrue(testObject.getFemaleNameByFirstLetter(startsWith).startsWith(expected));
    }

    @Test
    public void get_last_name_by_first_letter(){
        char startsWith = 'V';
        String expected = "V";

        Assert.assertTrue(testObject.getLastNameByFirstLetter(startsWith).startsWith(expected));
    }


}
