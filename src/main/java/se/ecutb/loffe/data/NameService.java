package se.ecutb.loffe.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static se.ecutb.loffe.model.RandomNumber.random;

public class NameService {

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

}
