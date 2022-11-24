package com.walking.counterAggregation;

import java.util.Scanner;

public class Counter {

    private String name;
    public static int count;
    private String unit;
    protected int value;


    public Counter(String name, int value, String unit) {
        this.name = name;
        this.value = value;
        this.unit=unit;
        count++;
    }

    public Counter(String name) {
        this.name = name;
    }

    int upCount() {
        return ++value;
    }



    int upCountIn(int x) {
        value += x;
        return count;
    }
}




