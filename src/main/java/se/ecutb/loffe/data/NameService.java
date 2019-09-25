package se.ecutb.loffe.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static se.ecutb.loffe.model.RandomNumber.random;

public class NameService {

    static Scanner SCAN = new Scanner(System.in);

    public List<String> maleFirstName() {
        List<String> names = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/Pojknamn.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public List<String> femaleFirstName() {
        List<String> names = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/Flicknamn.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public List<String> lastName() {
        List<String> names = new ArrayList<>();

        try (BufferedReader reader = Files.newBufferedReader(Paths.get("src/Efternamn.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                names.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return names;
    }

    public String getRandomMaleName(){
        return maleFirstName().get(random(maleFirstName().size()));
    }

    public String getRandomFemaleName(){
        return femaleFirstName().get(random(femaleFirstName().size()));
    }

    public String getRandomLastName(){
        return lastName().get(random(lastName().size()));
    }


    public String getFemaleFirstAndLastName() {
        return getRandomFemaleName().trim() + " " + getRandomLastName();
    }

    public String getMaleFirstAndLastName() {
        return getRandomMaleName().trim() + " " + getRandomLastName();
    }

    public String getRandomMaleOrFemaleFirstAndLastName(int gender){
        if (gender > 1){
            gender = random(2);
        }

        if (gender == 0){
            return getRandomMaleName().trim() + " " + getRandomLastName();
        }else {
            return getRandomFemaleName().trim() + " " + getRandomLastName();
        }
    }

    public List<String> getMultipleRandomMaleNamesWithFixedLastName(String lastname, int numberOfNames){
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < numberOfNames; i++) {
            nameList.add(getRandomMaleName().trim() + " " + lastname);
        }
        return nameList;
    }

    public List<String> getMultipleRandomFemaleNamesWithFixedLastName(String lastname, int numberOfNames){
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < numberOfNames; i++) {
            nameList.add(getRandomFemaleName().trim() + " " + lastname);
        }
        return nameList;
    }


    public List<String> getMultipleRandomNames(int numberOfNames){
        List<String> nameList = new ArrayList<>();
        for (int i = 0; i < numberOfNames; i++) {
            if (random(2) == 0){
                nameList.add(getRandomMaleName());
            }else {
                nameList.add(getRandomFemaleName());
            }

        }
        return nameList;
    }

    public String getMaleNameByFirstLetter(char firstLetter){
        List<String> nameList = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        for (String name : maleFirstName()){
            if(name.charAt(0) == firstLetter){
                nameList.add(name);
            }
        }
        return nameList.get(random(nameList.size()));
    }

    public String getFemaleNameByFirstLetter(char firstLetter){
        List<String> nameList = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        for (String name : femaleFirstName()){
            if(name.charAt(0) == firstLetter){
                nameList.add(name);
            }
        }
        return nameList.get(random(nameList.size()));
    }

    public String getLastNameByFirstLetter(char firstLetter){
        List<String> nameList = new ArrayList<>();
        List<String> newList = new ArrayList<>();
        for (String name : lastName()){
            if(name.charAt(0) == firstLetter){
                nameList.add(name);
            }
        }
        return nameList.get(random(nameList.size()));
    }







    public void printList(){
        System.out.print("Enter number of names: ");
        System.out.println(getMultipleRandomNames(getValidInt()));
    }

    public static String getString(){
        return SCAN.nextLine();
    }

    public int getValidInt() {
        boolean valid = false;
        int number = 0;
        while (!valid) {
            try {
                number = Integer.parseInt(getString());
                valid = true;
            } catch (NumberFormatException exception) {
                System.out.println("Please enter a number.");
                return number;
            }
        }
        return number;
    }




}
