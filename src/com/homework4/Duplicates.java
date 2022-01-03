package com.homework4;

import java.util.ArrayList;
import java.util.HashSet;

public class Duplicates {

    public static <V> HashSet<V> withoutDuplicate(ArrayList<V> someObjects){
        HashSet<V> withoutDuplicate = new HashSet<V>(someObjects);
        return withoutDuplicate;
    }
}
