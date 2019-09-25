package se.ecutb.loffe;

import se.ecutb.loffe.data.NameService;

public class App 
{
    public static void main( String[] args ) {
        NameService nameService = new NameService();

        System.out.println(nameService.getMaleNameByFirstLetter('B'));
        System.out.println(nameService.getFemaleNameByFirstLetter('B'));
        System.out.println(nameService.getLastNameByFirstLetter('B'));

    }
}
