package me.apesander.main.code;

import java.util.Random;

public class RandomNum {
    public int getNum(int min, int max) {
        Random r = new Random();
        return r.nextInt(max - min) + min;
    }
}
