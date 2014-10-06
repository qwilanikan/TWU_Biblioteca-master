package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by danielleerickson on 10/3/14.
 */
public class Main {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        PrintStream printStream = new PrintStream(System.out);
        MessagePrinter messagePrinter = new MessagePrinter(printStream);

        List<Book> books = books();

        Library library = new Library(printStream, books);

        Menu menu = new Menu(printStream, bufferedReader, library);

        BibliotecaApp bibApp = new BibliotecaApp(messagePrinter, menu, library);

        bibApp.run();
    }

    private static List<Book> books() {
        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Agile Samurai", "author1","1000"));
        books.add(new Book("Clean Code", "author2","2525"));
        books.add(new Book("Cookbook", "camp","1234"));
        return books;
    }
}
