package se.ecutb.loffe;

import se.ecutb.loffe.data.NameService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        NameService nameService = new NameService();

        System.out.println(nameService.getFemaleFirstAndLastName());

        System.out.println(nameService.getMaleFirstAndLastName());

    }
}
