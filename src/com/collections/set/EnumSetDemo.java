package com.collections.set;

import java.util.EnumSet;

enum Cars {
    TESLA,
    FORD,
    LAMBORGHINI,
    MARUTI
}

public class EnumSetDemo {
    public static void main(String[] args) {

        EnumSet<Cars> set1, set2;

        set1 = EnumSet.of(Cars.FORD, Cars.MARUTI, Cars.TESLA);

        set2 = EnumSet.complementOf(set1);

        System.out.println(set1);
        System.out.println(set2);

    }
}
