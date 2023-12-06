package entities;

import java.util.Random;

public interface RandomId {
    Random rndm = new Random();

     static long generateRandom() {
        return rndm.nextInt(1, 200);
    }
}
