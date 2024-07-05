package org.example;

public class Book {
    String isbn;
    String name;
    int year;

    public Book(String name, int year, String isbn){
        this.name = name;
        this.year = year;
        this.isbn = isbn;
    }

    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setYear(int year){
        this.year = year;

    }

    public int getYear(){
        return year;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;

    }

    public String getIsbn(){
        return isbn;
    }

}
