package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

public class Library {

    private PrintStream printStream;
    private List<String> books;

    public Library(PrintStream printStream, List<String> books) {
        this.printStream = printStream;
        this.books = books;

    }

    public void listBooks() {
        for (String book : books) {
            printStream.println(book);
        }
    }
}
