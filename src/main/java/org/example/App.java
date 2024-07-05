package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//useful links:
// https://medium.com/swlh/java-collectors-and-its-20-methods-2fc422920f18#:~:text=Collectors%20is%20a%20final%20class,according%20to%20various%20criteria%2C%20etc.

public class App
{
    public static Map<String, String> listToMap(List<Book> books) {
        return books.stream().collect(Collectors.toMap(Book::getIsbn, Book::getName));
    }


    public static void main( String[] args )
    {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Fellowship of the Ring", 1954, "0395489318"));
        bookList.add(new Book("The Two Towers", 1954, "0345339711"));
        bookList.add(new Book("The Return of the King", 1955, "0618129111"));

        System.out.println(listToMap(bookList));

    }
}
