package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        List<String> list = new ArrayList<>();
//        list.add("a");
//
//        list.set(0, "aa");
//
//
//        list.add("b");
//        list.add("c");
//        list.add("d");

        //insert
//        list.add(0, "z");

        //upsert -> if exists - update, if does not exist - create


        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new ArrayList<>();

//        processOperation(linkedList, "linked list");
        processOperation(arrayList, "array list");

        //Add (end)
        //LinkedList
        //8270

        //ArrayList
        //561


        //remove (middle) (1M - 10K)
        //LinkedList
        //40 000


        //ArrayList
        //5588




    }

    private static void processOperation(List<Integer> list, String listType) throws InterruptedException {
        for (int i = 0; i < 1_000_000; i++) {
            list.add(1000);
        }

        System.out.println("Test started");

        long start = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            list.remove(list.size()/2);
        }

        long end = System.currentTimeMillis();

        System.out.println("result " + listType + ": " + (end - start));
    }
}
