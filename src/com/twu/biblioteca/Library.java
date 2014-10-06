package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.List;

public class Library {

    private PrintStream printStream;
    private List<Book> books;
    private BufferedReader bufferedReader;

    public Library(PrintStream printStream, List<Book> books, BufferedReader bufferedReader) {
        this.printStream = printStream;
        this.books = books;

        this.bufferedReader = bufferedReader;
    }

    public void listBooks() {
        for (Book book : books) {
            printStream.println(book.getFormattedDetails());
        }
    }

    public void checkoutBook(Book book) {
        books.remove(book);
    }

    public Book getBookToCheckOut(String title) {
        for (Book book : books) {
            String details = book.getFormattedDetails();
            if (details.contains(title)){
                return book;
            }
        }
        // message

        return null;
    }
}
