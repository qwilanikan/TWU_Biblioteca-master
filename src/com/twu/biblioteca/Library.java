package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alisonpolton-simon on 9/30/14.
 */
public class Library {

    private String books;

    public Library(String books) {
        this.books = books;
    }

    public String listBooks() {
        return this.books;
    }
}
