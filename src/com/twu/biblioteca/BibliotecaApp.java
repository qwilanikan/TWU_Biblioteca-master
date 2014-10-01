package com.twu.biblioteca;

import com.javafx.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.PrintStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        MessagePrinter printer = new MessagePrinter(System.out);
        printer.printWelcome();

        BookListBuilder bookListBuilder = new BookListBuilder();

        Library library = new Library(System.out, bookListBuilder.setUpBooks());
        library.listBooks();

        Book book = new Book("title","author","year");
        System.out.println(book.toString());
    }


}
