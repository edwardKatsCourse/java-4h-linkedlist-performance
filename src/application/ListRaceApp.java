package application;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ListRaceApp {

    private static final int NUM_NUM = 10_000_000;
    private static final int NUM_ITER = 100;
    static Random gen = new Random();

    public static void main(String[] args) {
        ArrayList<Integer> ali = new ArrayList<>();
        LinkedList<Integer> lli = new LinkedList<>();

        int num = 0;
        for (int i = 0; i < NUM_NUM; i++) {
            num = 1000;
            ali.add(num);
            lli.add(num);
        }
        int middle = NUM_NUM / 2;

//        arrayList(ali);
//        linkedList(lli);

        //~4-4.7-5.5 SEC

        //5.2-6.3 SEC

        long t1 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ITER; i++) {
            ali.remove(NUM_NUM / 2);
        }
        long t2 = System.currentTimeMillis();

        long t3 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ITER; i++) {
            lli.remove(NUM_NUM / 2);
        }
        long t4 = System.currentTimeMillis();

        System.out.println("ArrayList: " + (t2 - t1) + "ms");
        System.out.println("LinkedList: " + (t4 - t3) + "ms");


        /**
         * ArrayList: 0ms
         * LinkedList: 4009ms
         *
         * LinkedList: 5384ms  -> >20% WORSE
         * ArrayList: 0ms
         *
         * ArrayList: 0 ms
         * LinkedList: 5586 ms
         */
    }

    private static void arrayList(List<Integer> ali) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ITER; i++) {
            ali.remove(NUM_NUM / 2);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("ArrayList: " + (t2 - t1) + "ms");
    }

    private static void linkedList(LinkedList<Integer> lli) {
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < NUM_ITER; i++) {
            lli.remove(NUM_NUM / 2);
        }
        long t2 = System.currentTimeMillis();
        System.out.println("LinkedList: " + (t2 - t1) + "ms");
    }


}
