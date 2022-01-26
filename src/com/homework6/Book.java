package com.homework6;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Book {

    public static final double MIN_PRICE = 1d;
    public static final double MAX_PRICE = 99d;
    public static final int MIN_LENGTH = 3;
    public static final int MAX_LENGTH = 10;
    private String name;
    private double price;

    public Book(String name, double price){
        this.name = name;
        this.price = price;
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Books:");
        List<Book> listOfBooks = listOfBooks(10);
        for (Book book : listOfBooks) {
            System.out.println(book);
        }


        System.out.println("\nList of all book names: \n" + getBookNames(listOfBooks) + "\n");
        System.out.println("Total price of all books: " + getTotalPriceOfAllBooks(listOfBooks) + "\n");
        System.out.println("List of books with “A” or “a” character in name: " + getAnyBookWithA(listOfBooks) + "\n");
        System.out.println("List of books with highest price: " + getListOfBooksWithHighestPrice(listOfBooks) + "\n");
        System.out.println("Book with highest price: " + getBookWithHighestPrice(listOfBooks) + "\n");
        System.out.println("Number of books where name consists of 5 letters: " +
                getNumberOfBookWithGivenLength(listOfBooks, 5) + "\n");
        System.out.println("All books except books with price higher then 30: \n" +
                getListOfBooksWithPriceLessThanGivenLimit(listOfBooks, 30d) + "\n");
        System.out.println("List of sorted books in desc order: \n" + getListOfBooksSortedDescByName(listOfBooks) + "\n");
        System.out.println("Library name is: " + getLibrary());
    }

    public static String getRandomName(){
        int randomLength = MIN_LENGTH + (int) (Math.random() * (MAX_LENGTH - MIN_LENGTH) + 1);
        return RandomStringUtils.randomAlphabetic(randomLength);
    }

    public static double getRandomPrice(){
        return ThreadLocalRandom.current().nextDouble(MIN_PRICE, MAX_PRICE);
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public static List<Book> listOfBooks (int numberOfBooks){
        return IntStream.range(0, numberOfBooks)
                .mapToObj(book -> new Book(getRandomName(), getRandomPrice()))
                .collect(Collectors.toList());
    }

    public static List<String> getBookNames (List<Book> allBooks){
        return allBooks.stream()
                .map(Book::getName)
                .collect(Collectors.toList());
   }

   public static double getTotalPriceOfAllBooks(List<Book> allBooks){
        return allBooks.stream()
                .mapToDouble(Book::getPrice)
                .sum();
   }

    public static String getAnyBookWithA(List<Book> allBooks) {
        return allBooks.stream()
                .map(Book::getName)
                .filter(str -> str.contains("A") || str.contains("a"))
                .collect(Collectors.joining(","));
    }

    public static List<Book> getListOfBooksWithHighestPrice(List<Book> allBooks) throws Exception {

        double maxPrice = allBooks.stream()
                .map(Book::getPrice)
                .max(Double::compare)
                .orElseThrow(() -> new Exception("Max price not found"));

        return allBooks.stream()
                .filter(book -> book.getPrice() == maxPrice).
                collect(Collectors.toList());
    }

    public static Book getBookWithHighestPrice(List<Book> allBooks){
        return allBooks.stream()
                .max(Comparator.comparing(Book::getPrice))
                .orElse(null);
    }

    public static int getNumberOfBookWithGivenLength (List<Book> allBooks, int givenLength){
        return (int) allBooks.stream()
                .map(Book::getName)
                .filter(str -> str.length() == givenLength)
                .count();
    }

    public static List<Book> getListOfBooksWithPriceLessThanGivenLimit (List<Book> allBooks, double givenLength){
        return allBooks.stream()
                .filter(book -> book.getPrice() < givenLength)
                .collect(Collectors.toList());
    }

    public static List<Book> getListOfBooksSortedDescByName(List<Book> allBooks) {

        return allBooks.stream()
                .sorted(Comparator.comparing(Book::getName).reversed().thenComparing(Comparator.comparing(Book::getPrice)))
                .collect(Collectors.toList());
    }

    //How can I get the library name using the book that was not added to the Map?
    public static String getLibrary(){

        Book book1 = new Book("book1", 5d);
        Book book2 = new Book("book2",5d);
        Map<Book, String> library = new HashMap<>();

        library.put(book1, "My Library");
        return library.get(book2);
    }

    @Override
    public String toString() {
        return "Book name: " + name + "; book price: " + price;
    }
}