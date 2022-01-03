package com.homework4;

import java.util.HashMap;

public class Dictionary {

    public static HashMap<Character, Integer> dictionary(String inputText) {

        char [] inputCharacters = inputText.toCharArray();

        HashMap <Character, Integer> alphabet = new HashMap<Character, Integer>();

        for (char i : inputCharacters){
            if(alphabet.containsKey(i)){
                Integer qty = alphabet.get(i);
                qty++;
                alphabet.put(i, qty);
            } else {
                alphabet.put(i, 1);
            }
        }
        return alphabet;
    }
}
