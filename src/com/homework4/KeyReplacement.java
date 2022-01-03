package com.homework4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class KeyReplacement {

    public static <V, K> Map<V, Collection <K>> keyReplacement (Map<K, V> input){
        HashMap<V, Collection<K>> replaced = new HashMap <V, Collection <K>>();

        for (K inputKey: input.keySet()){
            V inputValue = input.get(inputKey);
            if (replaced.containsKey(inputValue)){
            Collection <K> replacedCollection = replaced.get(inputValue);
            replacedCollection.add(inputKey);
            replaced.replace(inputValue, replacedCollection);
            } else {
                Collection <K> keyCollection = new ArrayList<>();
                keyCollection.add(inputKey);
                replaced.put(input.get(inputKey), keyCollection);
            }
        }
        return replaced;
    }
}
