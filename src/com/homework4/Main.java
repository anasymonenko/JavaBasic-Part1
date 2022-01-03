package com.homework4;


import java.util.*;

public class Main {

    public static void main(String[] args){

    //Task1
        HashMap<Character, Integer> dictionaryInstanse = Dictionary.dictionary("successfully");
        for (Character i: dictionaryInstanse.keySet()) {
            System.out.println("letter: " + i + " frequency: " + dictionaryInstanse.get(i));
        }
    //Task2
        ArrayList<String> someObjects = new ArrayList<>();
        someObjects.add("1");
        someObjects.add("Computer");
        someObjects.add("Task");
        someObjects.add("Shape");
        someObjects.add("1");
        someObjects.add("Computer");
        someObjects.add("Task");
        someObjects.add("Shape");

        HashSet<String> returnWithoutDuplicates = Duplicates.withoutDuplicate(someObjects);
        for (String i: returnWithoutDuplicates){
            System.out.println(i);
        }
    //Task3
        Map<String, String> inputMap = new HashMap<String, String>();
        inputMap.put("One", "Apple");
        inputMap.put("Three", "Orange");
        inputMap.put("Seven", "Watermelon");
        inputMap.put("Eight", "Grape");

        Map<String, Collection<String>> replacedMap = KeyReplacement.keyReplacement(inputMap);
        for (String i: replacedMap.keySet()) {
            System.out.println("Key: " + i + " Value: " + replacedMap.get(i));
        }

    //Task4
        ArrayList<String> inputOrders = new ArrayList<>();
        inputOrders.add("Champagne, pineapples, candies");
        inputOrders.add("Cheese, sausage, corn");
        inputOrders.add("Cake");
        inputOrders.add("Champagne, pineapples, candies");
        inputOrders.add("Champagne, pineapples, candies");
        inputOrders.add("Cheese, sausage, corn");

        HashSet<String> hashSetOrders = Orders.returnHashSet(inputOrders);
        TreeSet<String> treeSetOrders = Orders.returnTreeSet(inputOrders);

        System.out.println("List of orders #1:");
        for (String i : hashSetOrders) {
            System.out.println("Order: " + i);
        }

        System.out.println("List of orders #2:");
        for (String i : treeSetOrders) {
            System.out.println("Order: " + i);
        }
    //Task5
        ArrayList<Integer> year = new ArrayList<>();
        year.add(1996);
        year.add(2001);
        year.add(1962);
        year.add(2011);
        year.add(2012);

        ArrayList<Integer> numberOfHousesBuilt = new ArrayList<>();
        numberOfHousesBuilt.add(5);
        numberOfHousesBuilt.add(25);
        numberOfHousesBuilt.add(11);
        numberOfHousesBuilt.add(3);

        TreeMap<Integer,Integer> housesV1 = Conversion.sortedV1(year, numberOfHousesBuilt);
        for (Integer i: housesV1.keySet()) {
            System.out.println("Year: " + i + " Number of Houses: " + housesV1.get(i));
        }

        TreeMap<Integer,Integer> housesV2 = Conversion.sortedV2(year, numberOfHousesBuilt);
        System.out.println(housesV2);
    }




}
