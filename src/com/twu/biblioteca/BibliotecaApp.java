package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        String books = new String();
        Library library = new Library(books);

        library.listBooks();

    }
}
