package se.ecutb.loffe.model;

import java.util.concurrent.ThreadLocalRandom;

public class RandomNumber {

    public static int random(int max) {
        return ThreadLocalRandom.current().nextInt(0, max);
    }
}
