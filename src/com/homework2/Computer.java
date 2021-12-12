package com.homework2;

/* Design such Java class with name Computer and such properties as:
-	Brand
-	Screen size
-	Number of cores
-	Type (laptop,desktop,etc.)
Make `Brand` and `Screen size` properties required in order to create an object(instance).
Create two auxiliary object of Computer class.
*/

public class Computer {
    private String brand;
    private double screenSize;
    private int numberOfCores;
    private String typeOfComputer;

    public Computer(String brand, double screenSize) {
        this.brand = brand;
        this.screenSize = screenSize;
    }

    public void setNumberOfCores (int numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public void setTypeOfComputer (String typeOfComputer) {
        this.typeOfComputer = typeOfComputer;
    }

    public String getBrand(){
        return brand;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getNumberOfCores() {
        return numberOfCores;
    }

    public String getTypeOfComputer() {
        return typeOfComputer;
    }
}
