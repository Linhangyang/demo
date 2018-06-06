package com.linable.helloworld;

import java.util.Random;

/**
 * @author HangYang.Lin
 *         on 2017/6/6.
 */
public class LinTest {

    public static void main(String[] args) {
        Random random = new Random();
        String fourRandom = random.nextInt(10000) + "";
        int randLength = fourRandom.length();
        if (fourRandom.length() < 4) {
            for (int i = 1; i <= 4 - randLength; i++)
                fourRandom = "0" + fourRandom;
        }
        System.out.println(fourRandom);
    }
}
