package com.twu.biblioteca;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        List<String> books = new ArrayList<String>();
        books.add("Clean Code");
        books.add("Agile Samurai");
        books.add("Joy of Cooking");

        Library library = new Library(System.out, books);
        library.listBooks();


    }
}
