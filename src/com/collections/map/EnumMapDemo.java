package com.collections.map;

import java.util.EnumMap;
import java.util.Map;

enum Days {
    MONDAY,
    TUESDAY,
    THURSDAY,
    FRIDAY
}

public class EnumMapDemo {
    public static void main(String[] args) {

        EnumMap<Days,String> map = new EnumMap<>(Days.class);

        map.put(Days.MONDAY, "1");
        map.put(Days.TUESDAY, "2");
        map.put(Days.FRIDAY, "5");

        System.out.println(map);

        for(Map.Entry m:map.entrySet()) {
            System.out.println(m.getKey() + " - " + m.getValue());
        }

    }
}
