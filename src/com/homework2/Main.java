package com.homework2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Exercise 1
        Concatenation c = new Concatenation();
        c.printStrings();
        c.printConcat();

        //Exercise 2
        Computer hp = new Computer("HP", 15.6);
        Computer asus = new Computer("Asus", 18);

        hp.setNumberOfCores(4);
        hp.setTypeOfComputer("notebook");

        asus.setNumberOfCores(2);
        asus.setTypeOfComputer("notebook");

        List<Computer> computers = new ArrayList<>();
        computers.add(hp);
        computers.add(asus);


        System.out.println("All computers: ");
        for (Computer computer: computers){
            System.out.println(computer.getBrand() + "," + computer.getScreenSize() + "," + computer.getNumberOfCores() + "," + computer.getTypeOfComputer());
        }

        //Exercise 4
        NumberHolder a = new NumberHolder(4, 10.5f);
        a.displayNumberHolder();
    }
}
