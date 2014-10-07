package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
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
        printStream.println("Thank you! Enjoy your book.");
        books.remove(book);
    }

    public Book getBookToCheckOut() {

        printStream.println("What is the title of the book you would like to checkout? ");
        String title = getInputFromUser();

        for (Book book : books) {
            String details = book.getFormattedDetails();
            if (details.contains(title)){
                return book;
            }
        }
        // message

        return null;
    }

    private String getInputFromUser() {
        String title = null;
        try {
            title = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return title;
    }


}
