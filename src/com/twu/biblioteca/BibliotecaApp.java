package com.twu.biblioteca;


import java.io.BufferedReader;
import java.util.ArrayList;

import java.util.List;

public class BibliotecaApp {


    private BufferedReader bufferedReader;

    public void run(BufferedReader bufferedReader) {
        MessagePrinter printer = new MessagePrinter(System.out);
        printer.printWelcome();

        MainMenu menu = new MainMenu(System.out, this.bufferedReader);
        menu.displayOptions();

        List<Book> books = new ArrayList<Book>();
        books.add(new Book("Agile Samurai", "author1","1000"));
        books.add(new Book("Clean Code", "",""));
        books.add(new Book("Cookbook", "",""));


        Library library = new Library(System.out, books);
        library.listBooks();

    }


}
