package se.ecutb.loffe;

import se.ecutb.loffe.data.NameService;

public class App 
{
    public static void main( String[] args )
    {
        NameService nameService = new NameService();

        System.out.println(nameService.getMultipleRandomMaleNamesWithFixedLastName("Knutsson", 5));

        System.out.println(nameService.getMultipleRandomFemaleNamesWithFixedLastName("Knutsson", 4));



    }
}
