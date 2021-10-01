package com.company;

import java.util.Scanner;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        Random random = new Random();
        //defines randomint
        //System.out.println("First random int is " + random.nextInt(1000));
        //defines randomdouble - randomdouble stays below 1 each time
        //System.out.println("First Random double is " + random.nextDouble());
// the max and minimum values that newRandom can have
        //int min = 1;
        //int max = 1000;
        //int newRandom = random.nextInt((max - min) + 9) + min;
        //System.out.println(newRandom);

        //System.out.println(Math.random());
// the (int) is the casting
        //int rand = (int) (Math.random() * 10);
        //System.out.println(rand);


        int newside[] = {};
        int x = 0;
        int minvalue = 0;
        int newdiceside = 0;
        System.out.println("how many sides do you have on your dice?");
        int diceside = Input.nextInt();
        System.out.println("How many times do you want to throw the dice?");
        int dicethrow = Input.nextInt();

        for (int i = 1; i <=diceside; i++){
            newside[i]= i


        }

        while (minvalue < dicethrow) {
            int min = 1;
            int max = diceside;
            int newRandom = random.nextInt((max - min) + 1) + min;
            System.out.println(newRandom);
        }
        minvalue++;
}
        }
    }
