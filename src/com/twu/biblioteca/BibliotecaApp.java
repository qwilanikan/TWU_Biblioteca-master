package com.twu.biblioteca;


import java.util.ArrayList;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter(System.out);
        printer.printWelcome();

        List<String> books = new ArrayList<String>();
        books.add("Clean Code");
        books.add("Agile Samurai");
        books.add("Joy of Cooking");

        Library library = new Library(System.out, books);
        library.listBooks();

        Book book = new Book("Title","author","year");
        System.out.println(book.toString());
    }


}
