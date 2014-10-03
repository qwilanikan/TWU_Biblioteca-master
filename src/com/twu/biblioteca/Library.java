package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

public class Library {

    private PrintStream printStream;
    private List<Book> books;

    public Library(PrintStream printStream, List<Book> books) {
        this.printStream = printStream;
        this.books = books;

    }

    public void listBooks() {
        for (Book book : books) {
            printStream.println(book.getFormattedDetails());
        }
    }
}
