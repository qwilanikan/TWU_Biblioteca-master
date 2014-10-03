package com.twu.biblioteca;


import java.util.ArrayList;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter(System.out);
        printer.printWelcome();

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Agile Samurai", "author1","1000"));
        books.add(new Book("Clean Code", "",""));
        books.add(new Book("Cookbook", "",""));


        Library library = new Library(System.out, books);
        library.listBooks();

        Book book = new Book("Title","author","year");
        System.out.println(book.getFormattedDetails());
    }


}
