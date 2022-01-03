package com.homework4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Orders {

    public static <V> HashSet<V> returnHashSet(ArrayList<V> inputOrders){

        HashSet<V> returnHashSet = new HashSet<V>(inputOrders);
        return returnHashSet;
    }

    public static <V> TreeSet<V> returnTreeSet(ArrayList<V> inputOrders){

        TreeSet<V> returnTreeSet = new TreeSet<V>(inputOrders);
        return returnTreeSet;
    }

}
