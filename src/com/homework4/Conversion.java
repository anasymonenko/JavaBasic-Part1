package com.homework4;

import java.util.List;
import java.util.TreeMap;

public class Conversion {

    public static <K,V> TreeMap<K,V> sortedV1 (List<K> listKey, List<V> listValue){
        TreeMap<K,V> sortedMap= new TreeMap<K,V>();

        for (int i = 0; i < listKey.size(); i++) {
            if (i < listValue.size()) {
                sortedMap.put(listKey.get(i), listValue.get(i));
            } else {
                sortedMap.put(listKey.get(i), null);
            }
        }
        return sortedMap;
    }
    public static <K,V> TreeMap<K,V> sortedV2 (List<K> listKey, List<V> listValue) {
        TreeMap<K, V> sortedMap = new TreeMap<K, V>();

        if (listKey.size() > listValue.size()){
            throw new ArithmeticException("Value is not enough for map");
        }

        if (listKey.size() < listValue.size()){
            throw new ArithmeticException("Key is not enough for map");
        }

        for (int i = 0; i < listKey.size(); i++) {
            sortedMap.put(listKey.get(i), listValue.get(i));
        }
        return sortedMap;
    }
}
